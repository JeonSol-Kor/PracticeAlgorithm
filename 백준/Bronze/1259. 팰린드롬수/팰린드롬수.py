while(True):
    palindrome = input()
    if palindrome == "0":
        break
    else:
        reverse = palindrome[::-1]
        if palindrome == reverse:
            print("yes")
        else:
            print("no")