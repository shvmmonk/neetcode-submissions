class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a = s1.toCharArray();
    Arrays.sort(a);
    String sortedS1 = new String(a);

    int k = s1.length();

    for (int i = 0; i <= s2.length() - k; i++) {

        char[] b = s2.substring(i, i + k).toCharArray();
        Arrays.sort(b);

        String window = new String(b);

        if (window.equals(sortedS1)) {
            return true;
        }
    }

    return false;
    }
}
