#include <iostream>

int add(int num1, int num2) {
  return num1 + num2;
}

int main() {
  int num1, num2;

  std::cout << "Enter the first number: ";
  std::cin >> num1;

  std::cout << "Enter the second number: ";
  std::cin >> num2;

  int sum = add(num1, num2);
  int ans = sum * 5;

  std::cout << ans << std::endl;

  return 0;
}
