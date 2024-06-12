import java.util.*;
import java.io.*;

class Solution {
    private static void updateMapValue(Map<String, Integer> map, String key, int delta) {
        int oldValue = map.get(key) != null ? map.get(key) : 0;
        int newValue = oldValue + delta;
        map.put(key, newValue);
    }
    
    public int solution(String[] friends, String[] gifts) throws IOException {
        // 1. 준사람 받은사람 표대로 2차원 배열을 만들어 넣는다.
        HashMap<String, Integer> indexFriends = new HashMap<>();
        for(int i = 0; i < friends.length; i++) {
            indexFriends.put(friends[i], i);
        }
        
        int[][] givNtak = new int[friends.length][friends.length];
        for(String names : gifts) {
            String[] name = names.split(" ");
            String giver = name[0];
            String taker = name[1];
            int giverIndex = indexFriends.get(giver);
            int takerIndex = indexFriends.get(taker);
            givNtak[giverIndex][takerIndex]++;
        }
        
        // 2. 선물지수를 해쉬맵으로 (키: 이름, 값: 선물지수)로 지정하여 만든다.
        HashMap<String, Integer> giftRc = new HashMap<>();
        for(int i = 0; i < friends.length; i++) {
            int giveCount = 0;
            int takeCount = 0;
            for(int j = 0; j < friends.length; j++) {
                giveCount += givNtak[i][j];
                takeCount += givNtak[j][i];
            }
            int giftIndex = giveCount - takeCount;
            giftRc.put(friends[i], giftIndex);
        }
        
        // 3. 2차원 배열을 통해 주고받은 기록을 확인 후 새로운 해쉬맵으로 (키: 이름, 값: 선물 받은 수) 에 저장한다.
        HashMap<String, Integer> giftTakeNow = new HashMap<>();
        for(int i = 0; i < friends.length; i++) {
            for(int j = i + 1; j < friends.length; j++) {
                if(givNtak[i][j] != givNtak[j][i]){
                    if(givNtak[i][j] > givNtak[j][i]) {
                        updateMapValue(giftTakeNow, friends[i], 1);
                    }else{
                        updateMapValue(giftTakeNow, friends[j], 1);
                    }
                }else{
        // 4. 선물지수를 확인하여 나보다 적은 사람한테 하나를 받는다. (이미 줬던 사람은 제외한다)
                    if(giftRc.get(friends[i]) > giftRc.get(friends[j])) {
                        updateMapValue(giftTakeNow, friends[i], 1);
                    }else if(giftRc.get(friends[i]) < giftRc.get(friends[j])) {
                        updateMapValue(giftTakeNow, friends[j], 1);
                    }
                }
                System.out.println("Value : " + giftTakeNow.get("ryan"));
            }
        }
        
        // 5. 선물 받은 수가 제일 많은 선물의 숫자를 출력
        int answer = 0;
        for (Map.Entry<String, Integer> entry : giftTakeNow.entrySet()) {
            if (entry.getValue() > answer) {
                answer = entry.getValue();
            }
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        
        return answer;
    }
}