**Project Report: Caesar and Vigenère Cipher Implementation**

**1. Introduction:**
This project demonstrates the implementation of two encryption algorithms: Caesar Cipher and Vigenère Cipher. The goal was to create a program where users can encrypt and decrypt messages using these ciphers.

**2. Design:**
- **Caesar Cipher**: Shifts each letter of the text by a certain number of positions in the alphabet. Non-letter characters are unchanged.
- **Vigenère Cipher**: Uses a keyword to determine the shift for each letter. The key repeats if the text is longer than the key.

**3. Implementation:**
- **Caesar Cipher**: The `caesarEncrypt` method shifts letters forward for encryption, and the `caesarDecrypt` method shifts them backward for decryption.
- **Vigenère Cipher**: The `vigenereEncrypt` method shifts letters based on the key, and the `vigenereDecrypt` method reverses the shift.

**4. User Interaction:**
Users can choose to encrypt or decrypt text using either cipher. They input the text and, for Caesar Cipher, a shift value; for Vigenère Cipher, a key is provided.

**5. Challenges:**
- **Input Handling**: Ensuring that input was valid, especially for shift values and keys.
- **Case Sensitivity**: The Vigenère Cipher only works with lowercase keys, but this could be improved.

**6. Conclusion:**
This project helped me understand how basic encryption methods work. It was a good introduction to cryptography, and the code is simple but shows how ciphers can be used to secure messages.
