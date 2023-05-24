<!DOCTYPE html>
<html>

<body>
  <h1>Explanation: AES Encryption and Decryption</h1>
  
  <h2>Usage</h2>
  <ol>
    <li>Clone the repository or download the <code>Main.java</code> and <code>AES.java</code> files.</li>
    <li>Compile the Java files:</li>
  </ol>
  <pre><code>javac Main.java AES.java</code></pre>
  <ol start="3">
    <li>Run the compiled Java program:</li>
  </ol>
  <pre><code>java Main</code></pre>
  <p>This will execute the <code>Main</code> class, which demonstrates the usage of the <code>AES</code> class to encrypt and decrypt a message using AES encryption with a secret key.</p>
  <ol start="4">
    <li>The program will encrypt and decrypt a sample message and display the results in the console.</li>
  </ol>
  
  <h2>Customization</h2>
  <p>If you want to use your own message and secret key, you can modify the <code>originalMessage</code> and <code>secretKey</code> variables in the <code>Main</code> class.</p>
  
  <h2>Note</h2>
  <ul>
    <li>This code is for demonstration purposes and may need additional error handling and security considerations in a production environment.</li>
    <li>Make sure to handle exceptions appropriately in your actual application.</li>
  </ul>
  
  <h2>Code Explanation</h2>
  
  <h3>Main.java</h3>
  <p>The <code>Main</code> class serves as the entry point of the program and demonstrates the usage of the <code>AES</code> class.</p>
  
  <h3>AES.java</h3>
  <p>The <code>AES</code> class contains methods for AES encryption and decryption.</p>
  
  <h4>Method: encrypt</h4>
  <p>This method takes a message and a secret key as input, performs AES encryption, and returns the encrypted message.</p>
  
  <h4>Method: decrypt</h4>
  <p>This method takes an encrypted message and a secret key as input, performs AES decryption, and returns the decrypted message.</p>
  

</body>
</html>
