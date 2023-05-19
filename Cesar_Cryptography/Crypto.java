public class Crypto {
    private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] letters;

    public void encrypt(String strToEncrypt) {
        letters = strToEncrypt.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if(letters[i] == alphabet[j]) {
                    if(letters[i] == 'x') {
                        letters[i] = 'a';
                    } else if(letters[i] == 'y') {
                        letters[i] = 'b';
                    } else if(letters[i] == 'z') {
                        letters[i] = 'c';
                    } else {
                        letters[i] = alphabet[(j + 3) % alphabet.length];
                        break;
                    }
                }
            }
        }
        System.out.print(letters);
    }

    public void decrypt(String strToDecrypt) {
        letters = strToDecrypt.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if(letters[i] == alphabet[j]) {
                    if(letters[i] == 'a') {
                        letters[i] = 'x';
                        break;
                    } else if(letters[i] == 'b') {
                        letters[i] = 'y';
                        break;
                    } else if(letters[i] == 'c') {
                        letters[i] = 'z';
                        break;
                    } else {
                        letters[i] = alphabet[(j - 3 + alphabet.length) % alphabet.length];
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.print(letters);
    }
}
