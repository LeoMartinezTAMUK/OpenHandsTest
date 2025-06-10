def add(num1, num2):
  num3 = num1 + num2
  return num3

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))


sum_of_numbers = add(num1, num2)
ans = sum_of_numbers * 5


# The answer should be the first two numbers added together and then that sum gets multiplied by 5 (as stated in the description)
print(ans)
