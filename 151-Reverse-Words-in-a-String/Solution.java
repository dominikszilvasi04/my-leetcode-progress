class Solution {
    public String reverseWords(String s) 
    {
        String [] array = s.trim().split("\\s+");

        String [] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) 
        {
            reversed[i] = array[array.length - 1 - i];
        }
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < reversed.length; i++)
        {
            if (i != 0)
            {
                string.append(" " + reversed[i]);
            }
            else
            {
                string.append(reversed[i]);
            }
        }
        return string.toString();
    }
}