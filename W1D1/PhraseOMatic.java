public class PhraseOMatic{
	public static void main(String[] args){
		String[] wordList1 = {"It", "He", "She", "I"};
		String[] wordList2 = {"ate", "Sat on", "jumped over", "hid"};
		String[] wordList3 = {"the cat", "the dog", "the fridge", "the TV"};
		
		int length1 = wordList1.length;
		int length2 = wordList2.length;
		int length3 = wordList3.length;

		int random1 = (int) (Math.random() * length1);
		int random2 = (int) (Math.random() * length2);
		int random3 = (int) (Math.random() * length3);

		System.out.println(wordList1[random1] + " " + wordList2[random2] + " " + wordList3[random3]);
	}
}