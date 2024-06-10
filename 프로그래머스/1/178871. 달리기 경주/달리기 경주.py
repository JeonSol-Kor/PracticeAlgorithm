def solution(players, callings):
    # 선수 이름과 등수를 저장할 딕셔너리
    player_rank = {player: i for i, player in enumerate(players)}

    # 해설진이 부른 이름을 순서대로 확인하여 위치 변경
    for calling in callings:
        rank = player_rank[calling]
        if rank > 0:
            # 추월이 가능한 경우 위치 변경
            temp = players[rank - 1]
            players[rank - 1] = calling
            players[rank] = temp
            player_rank[calling] = rank - 1
            player_rank[temp] = rank

    return players