# RSA Encryption and Decryption

This repository contains a Java program that demonstrates RSA encryption and decryption using public and private keys.

## Description

The `RSAEncryption_Decryption` class is the main class of the program. It provides methods to generate a key pair, encrypt data using the public key, and decrypt the encrypted data using the private key. The program also includes methods to save the generated keys to files and read them back for encryption and decryption.

## Classes

- `RSAEncryption_Decryption`: The main class that demonstrates RSA encryption and decryption. It contains methods to generate key pairs, save keys to files, encrypt data, and decrypt data.

## Objects

- `keyPairGenerator`: An instance of the `KeyPairGenerator` class used to generate the RSA key pair.

- `keyPair`: An instance of the `KeyPair` class representing the generated RSA key pair.

- `publicKey`: An instance of the `PublicKey` class representing the public key from the generated key pair.

- `privateKey`: An instance of the `PrivateKey` class representing the private key from the generated key pair.

- `rsaObj`: An instance of the `RSAEncryption_Decryption` class to access its methods.

## Functions

- `main`: The main function where the program starts execution. It generates a new RSA key pair, displays the public and private keys, saves them to files, encrypts data using the public key, and decrypts the encrypted data using the private key.

- `saveKeys`: Saves the modulus and exponent of a key to a file using `ObjectOutputStream`.

- `encryptData`: Encrypts the input data using the public key and returns the encrypted data as a byte array.

- `decryptData`: Decrypts the input data using the private key and displays the decrypted data.

- `readPublicKeyFromFile`: Reads the public key from a file, deserializes the modulus and exponent using `ObjectInputStream`, and returns the reconstructed public key.

- `readPrivateKeyFromFile`: Reads the private key from a file, deserializes the modulus and exponent using `ObjectInputStream`, and returns the reconstructed private key.

## Usage

1. Clone the repository or download the source code.

2. Open the project in your Java development environment.

3. Run the `RSAEncryption_Decryption` class.

4. The program will generate a new RSA key pair with a key size of 2048 bits. The public key and private key will be displayed in the console.

5. The program will save the public key to a file named `Public.key` and the private key to a file named `Private.key`.

6. The program will encrypt the data "My password classified Anas Filali data!" using the public key and display the encrypted data in the console.

7. The program will decrypt the encrypted data using the private key and display the decrypted data in the console.

Note: The generated key pair and the encrypted/decrypted data will differ each time the program is run.

## Requirements

- Java Development Kit (JDK) 8 or above.

## References

The code is based on the tutorial by Anuj Verma available at [Golden Package by Anuj](https://goldenpackagebyanuj.blogspot.com).

## License

This project is licensed under the [MIT License](LICENSE).

