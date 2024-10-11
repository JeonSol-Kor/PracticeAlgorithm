import java.util.*;

class Solution {
    // 가능한 할인율
    static int[] discountRates = {10, 20, 30, 40};
    static int[] emoticonDiscounts;
    static int maxSubscribers = 0;
    static int maxSales = 0;
    static int[][] usersGlobal;
    static int[] emoticonsGlobal;

    // 사용자들의 최소 할인율 기준
    static int minUserDiscountRate = 40;

    public int[] solution(int[][] users, int[] emoticons) {
        usersGlobal = users;
        emoticonsGlobal = emoticons;
        emoticonDiscounts = new int[emoticons.length];

        // 사용자들의 최소 할인율 기준 계산
        for (int[] user : users) {
            minUserDiscountRate = Math.min(minUserDiscountRate, user[0]);
        }

        // 할인율 리스트를 사용자 최소 할인율 이상으로 필터링
        discountRates = getFilteredDiscountRates(minUserDiscountRate);

        // DFS 탐색 시작
        dfs(0);

        return new int[]{maxSubscribers, maxSales};
    }

    // 사용자 최소 할인율 기준으로 할인율 필터링
    private int[] getFilteredDiscountRates(int minRate) {
        return Arrays.stream(discountRates)
                .filter(rate -> rate >= minRate)
                .toArray();
    }

    private void dfs(int depth) {
        if (depth == emoticonsGlobal.length) {
            calculate();
            return;
        }
        for (int discount : discountRates) {
            emoticonDiscounts[depth] = discount;
            dfs(depth + 1);
        }
    }

    private void calculate() {
        int subscribers = 0;
        int sales = 0;

        for (int[] user : usersGlobal) {
            int userDiscountRate = user[0];
            int userMinPrice = user[1];

            int totalPrice = 0;

            for (int i = 0; i < emoticonsGlobal.length; i++) {
                if (emoticonDiscounts[i] >= userDiscountRate) {
                    int discountedPrice = emoticonsGlobal[i] * (100 - emoticonDiscounts[i]) / 100;
                    totalPrice += discountedPrice;
                }
            }

            if (totalPrice >= userMinPrice) {
                subscribers++;
            } else {
                sales += totalPrice;
            }
        }

        // 현재 결과가 더 나은지 판단
        if (subscribers > maxSubscribers) {
            maxSubscribers = subscribers;
            maxSales = sales;
        } else if (subscribers == maxSubscribers && sales > maxSales) {
            maxSales = sales;
        }
    }
}
