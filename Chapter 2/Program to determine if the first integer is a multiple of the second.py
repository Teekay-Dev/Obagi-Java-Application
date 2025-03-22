 #Program to determine if the first integer is a multiple of the second

 #Read two integers from the user
num1 = int(input("Enter the first integer: "))
num2 = int(input("Enter the second integer: "))

 #Check if the first integer is a multiple of the second
if num2 != 0:  # Ensure division by zero doesn't occur
    if num1 % num2 == 0:
        print(f"{num1} is a multiple of {num2}.")
    else:
        print(f"{num1} is not a multiple of {num2}.")
else:
    print("The second integer cannot be zero.")
