class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        var finalAnswer = ArrayList<List<Int>>();
        if(numRows > 0){
            finalAnswer.add(arrayListOf(1));
        }
        if(numRows > 1){
            finalAnswer.add(arrayListOf(1,1));
        }
        if(numRows > 2){
            for(i in 2..numRows-1){
                var li = arrayListOf(1);
                for(j in 0..(finalAnswer[i-1].size-2)){
                    li.add(finalAnswer[i-1][j]+finalAnswer[i-1][j+1]);
                }
                li.add(1);
                finalAnswer.add(li);
            }
        }
        return finalAnswer;
    }
}
