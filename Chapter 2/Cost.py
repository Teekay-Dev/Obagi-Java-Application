def main():
    print("Car-Pool Savings Calculator")
    print("---------------------------")
    
    # Gather input from user
    miles_driven_per_day = float(input("Enter the total miles driven per day: "))
    cost_per_gallon = float(input("Enter the cost per gallon of gasoline: "))
    miles_per_gallon = float(input("Enter the average miles per gallon: "))
    parking_fees_per_day = float(input("Enter the parking fees per day: "))
    tolls_per_day = float(input("Enter the tolls per day: "))
    
    # Calculate the fuel cost per day.
    # Fuel cost = (miles driven / efficiency) * cost per gallon
    fuel_cost = (miles_driven_per_day / miles_per_gallon) * cost_per_gallon
    
    # Total cost per day includes fuel cost, parking, and tolls.
    daily_cost = fuel_cost + parking_fees_per_day + tolls_per_day
    
    # Output a breakdown of the costs.
    print("\n--- Daily Driving Cost Breakdown ---")
    print(f"Fuel Cost:           ${fuel_cost:.2f}")
    print(f"Parking Fees:        ${parking_fees_per_day:.2f}")
    print(f"Tolls:               ${tolls_per_day:.2f}")
    print("--------------------------------------")
    print(f"Total Daily Cost:    ${daily_cost:.2f}")

if __name__ == "__main__":
    main()
