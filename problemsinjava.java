//Practice from Building Java Programs (UW Practice-IT)

///////////////////////////////////////
///////////////////////////////////////
//All odd numbers from -6 to 38
///////////////////////////////////////
///////////////////////////////////////
int[] odds = new int[22];
for(i=0; i<22; i++){
	odds[i] = i * 2 -5;
}

///////////////////////////////////////
///////////////////////////////////////
//Example of storing entries in an array
///////////////////////////////////////
///////////////////////////////////////

public class GameEntry{
	private String name; //Name of the person earning the score
	private int score; //The value of the score

	//A GameEntry constructor with given parameters
	public GameEntry(String n, int s){
		name = n;
		score = s;
	}
	//A method that returns the name field
	public String getName(){
		return name;
	}

	//A method that returns score field
	public getScore(){
		return score;
	}

	//A method that returns a string representation of the entry
	public String toString(){
		return"(" + name + ", "+ score + ")";
	}
}
///////////////////////////////////////
///////////////////////////////////////
//Printing all permutations of a string
///////////////////////////////////////
///////////////////////////////////////

public class StringPermutation {

    public List<String> permute(char input[]) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char ch : input) {
            countMap.compute(ch, (key, val) -> {
                if (val == null) {
                    return 1;
                } else {
                    return val + 1;
                }
            });
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        List<String> resultList = new ArrayList<>();
        char result[] = new char[input.length];
        permuteUtil(str, count, result, 0, resultList);
        return resultList;
    }

    public void permuteUtil(char str[], int count[], char result[], int level, List<String> resultList) {
        if (level == result.length) {
            resultList.add(new String(result));
            return;
        }

        for(int i = 0; i < str.length; i++) {
            if(count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1, resultList);
            count[i]++;
        }
    }

    private void printArray(char input[]) {
        for(char ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        StringPermutation sp = new StringPermutation();
        sp.permute("AABC".toCharArray()).forEach(s -> System.out.println(s));
    }
}


