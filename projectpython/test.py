try:
    number = input("Enter a number(pls space): ")
    number = [int(x) for x in number.split()]
    total = sum(number)
    print(f"The sum of the numbers is: {total}")

except ValueError:
    print("Please enter only numbers separated by spaces.")