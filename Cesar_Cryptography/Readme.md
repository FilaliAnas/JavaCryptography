# Crypto Encryption/Decryption Example

This is a simple Java program that demonstrates encryption and decryption using a basic substitution cipher. The program uses the `Crypto` class to perform encryption and decryption operations.

## Algorithm

The algorithm used in this program is a simple substitution cipher. It maps each letter of the alphabet to another letter based on a fixed rule. In this implementation:

- Each letter in the alphabet is shifted three positions to the right for encryption.
- The letters 'x', 'y', and 'z' are wrapped around to 'a', 'b', and 'c', respectively.
- Similarly, for decryption, each letter is shifted three positions to the left, and 'a', 'b', and 'c' are wrapped around to 'x', 'y', and 'z', respectively.

Please note that this algorithm is not secure for real-world encryption purposes and is used here only for illustrative purposes.

## Code Structure

The code consists of the following components:

### Crypto Class

- `private char[] alphabet`: An array representing the alphabet letters.
- `private char[] letters`: An array to store the letters of the string being processed.
- `public void encrypt(String strToEncrypt)`: A method to encrypt the given string using the substitution cipher algorithm.
- `public void decrypt(String strToDecrypt)`: A method to decrypt the given string using the substitution cipher algorithm.

### Main Class

The `Main` class contains the `main` method, which demonstrates the usage of the `Crypto` class.

- Create an instance of the `Crypto` class.
- Define a string that needs to be encrypted.
- Call the `encrypt` method to encrypt the original string and print the result.
- Define a string that contains the encrypted version of the original string.
- Call the `decrypt` method to decrypt the encrypted string and print the result.

## Usage

To run the program and see the encryption and decryption in action, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Compile the Java source files using the following command: `javac Main.java Crypto.java`
3. Run the program with the following command: `java Main`

The program will output the original string, the encrypted string, and the decrypted string.

Feel free to modify the code and experiment with different strings for encryption and decryption.

