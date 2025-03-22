def main():
    # Greet the user and input values
    print("World Population Growth Calculator")
    current_population = float(input("Enter the current world population: "))
    annual_growth_rate_percent = float(input("Enter the annual growth rate (in %): "))
    
    # Convert the percentage growth rate to a decimal
    annual_growth_rate = annual_growth_rate_percent / 100
    
    # Display header for the results
    print("\nYear   Estimated Population")
    print("------------------------------")
    
    # Compute and display the population for each year from 1 to 5
    for year in range(1, 6):
        future_population = current_population * ((1 + annual_growth_rate) ** year)
        # The estimated population is formatted without decimals and with commas for readability.
        print(f"{year:<6} {future_population:,.0f}")

if __name__ == "__main__":
    main()
