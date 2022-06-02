package got.java.dev6.module7;

class WordSplitter {
    public String split(String phrase) {
        String[] s = phrase.split(" ");
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != "") {
                st.append(s[i]);
                st.append(" ");
            }
        }

        return st.toString();
    }
}