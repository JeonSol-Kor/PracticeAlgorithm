def solution(friends, gifts):
    # 1. 2차원 배열로 준 사람 받은 사람 배열을 만듦
    givNtak = [[0] * len(friends) for _ in range(len(friends))]
    for gift in gifts:
        giver, taker = gift.split(" ")
        giverIndex = friends.index(giver)
        takerIndex = friends.index(taker)
        givNtak[giverIndex][takerIndex] += 1
        
    # 2. 1차원 배열로 선물지수를 만듦(인덱스로 구분)
    giftRc = list()
    for i in range(len(friends)):
        giveC = 0
        takeC = 0
        for j in range(len(friends)):
            giveC += givNtak[i][j]
            takeC += givNtak[j][i]
        giftRc.append(giveC - takeC)
    
    # 3. 다음달 선물 예측
    nextGift = [0] * len(friends)
    
    for i in range(len(friends)):
        for j in range(i + 1, len(friends)):
            if givNtak[i][j] == givNtak[j][i]:
                if giftRc[i] == giftRc[j]:
                    continue
                index = i if giftRc[i] > giftRc[j] else j
                nextGift[index] += 1
                continue
            index = i if givNtak[i][j] > givNtak[j][i] else j
            nextGift[index] += 1
    
    # 4. 선물지수 배열에서 숫자가 제일 큰 것을 출력
    answer = max(nextGift)
    return answer