def formation(N, B):
    Quotient = N//B
    Remainder = N % B
    
    if Remainder > 9:
        Remainder = chr(ord('A') + Remainder - 10)
    
    if(Quotient >= B):
        formation(Quotient, B)
        print(Remainder, end="")
    elif(Quotient == 0):
        print(Remainder, end="")
    else:
        if Quotient > 9:
            Quotient = chr(ord('A') + Quotient - 10)
        print(Quotient, end="")
        print(Remainder, end="")

N, B = map(int, input().split())

formation(N,B)