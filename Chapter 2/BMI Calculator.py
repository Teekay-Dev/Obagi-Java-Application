# BMI Calculator
def calculate_bmi():
    print("Welcome to the BMI Calculator!")
    measurement_system = input("Enter '1' for pounds/inches or '2' for kilograms/meters: ")
    
    if measurement_system == '1':
        # Using pounds and inches
        weight = float(input("Enter your weight in pounds: "))
        height = float(input("Enter your height in inches: "))
        bmi = (weight / (height ** 2)) * 703  # BMI formula for pounds/inches
    elif measurement_system == '2':
        # Using kilograms and meters
        weight = float(input("Enter your weight in kilograms: "))
        height = float(input("Enter your height in meters: "))
        bmi = weight / (height ** 2)  # BMI formula for kilograms/meters
    else:
        print("Invalid input! Please restart and select a valid option.")
        return

    print(f"Your BMI is: {bmi:.2f}")
    print("BMI Categories:")
    print("Underweight: less than 18.5")
    print("Normal weight: 18.5 – 24.9")
    print("Overweight: 25 – 29.9")
    print("Obesity: 30 or greater")
    
    # Evaluate the user's BMI
    if bmi < 18.5:
        print("You are underweight.")
    elif 18.5 <= bmi <= 24.9:
        print("You are of normal weight.")
    elif 25 <= bmi <= 29.9:
        print("You are overweight.")
    else:
        print("You are obese.")

# Run the calculator
calculate_bmi()
