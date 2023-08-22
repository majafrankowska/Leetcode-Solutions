168. Excel Sheet Column Title
Difficulty - Easy 

class Solution {
    public String convertToTitle(int columnNumber) {
        return columnNumber == 0 ? "" : convertToTitle((columnNumber - 1)/26) + (char)('A' + ((columnNumber-1) % 26));
    }
}
