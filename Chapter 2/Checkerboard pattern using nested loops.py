# Checkerboard pattern using nested loops

rows = 8   # Number of rows for the pattern
columns = 8  # Number of columns for the pattern

for i in range(rows):
    for j in range(columns):
        # Determine whether to print an asterisk or a space:
        # When the sum of row and column indices is even, print "*",
        # otherwise print a space.
        if (i + j) % 2 == 0:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    # Move to the next line after finishing the row
    print()
