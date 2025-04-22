# Palindrome Number Checker

A simple Java console application that checks whether a given integer is a **palindrome**—a number that reads the same backward as forward.

## 📋 Features

- Accepts an integer input from the user
- Reverses the number using basic arithmetic operations
- Compares the reversed number with the original to determine if it's a palindrome
- Displays the result clearly

## 🚀 Getting Started

### Requirements

- Java Development Kit (JDK 8 or higher)

### How to Compile

```bash
javac Palindrome.java
```

### How to Run

```bash
java Palindrome
```

## 🖥️ Example

```
Enter a number
121
121 is a Palindrome!~
```

```
Enter a number
123
123 is NOT a Palindrome.
```

## 💡 How It Works

- Extracts digits one by one using modulus and division
- Constructs the reversed number
- Compares original and reversed values

## 🧠 Enhancements You Could Add

- Support for checking **string-based palindromes** (e.g., "madam", "racecar")
- Add input validation (e.g., reject negative numbers or non-integer input)
- Check for palindromes in a range of numbers
- Use GUI components for a more interactive version

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
