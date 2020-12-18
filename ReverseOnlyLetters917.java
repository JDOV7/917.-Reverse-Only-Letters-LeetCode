package leetcode;

import java.util.Vector;

public class ReverseOnlyLetters917 {

    public void ReverseOnlyLetters917() {
        String S = "a-bC-dEf-ghIj";
        StringBuffer sReturn = new StringBuffer(S);
        Vector<CharacterAndPosition> vList = new Vector();
        int iPosition = 0;
        for (int i = 0; i < sReturn.length(); i++) {
            if (!((sReturn.charAt(i) >= 'a' && sReturn.charAt(i) <= 'z')
                    || (sReturn.charAt(i) >= 'A' && sReturn.charAt(i) <= 'Z'))) {
                vList.add(new CharacterAndPosition(i + iPosition, sReturn.charAt(i)));
                iPosition++;
                sReturn.deleteCharAt(i);
                i = -1;
            }
        }
        sReturn.reverse();
        for (int i = 0; i < vList.size(); i++) {
            sReturn.insert(vList.get(i).getPosition(), vList.get(i).getCharacter());
        }
        System.out.println(sReturn.toString());
    }

    public class CharacterAndPosition {

        int iPosition;
        char cCharacter;

        public CharacterAndPosition(int ipos, char character) {
            iPosition = ipos;
            cCharacter = character;
        }

        public int getPosition() {
            return iPosition;
        }

        public char getCharacter() {
            return cCharacter;
        }
    }
}
