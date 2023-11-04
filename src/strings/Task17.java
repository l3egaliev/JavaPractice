package strings;

/**
 * ѕоиск и удаление всех HTML-тегов из строки
 */

public class Task17 {


    // Without regex
    public static String removeHTMLTeg(String text){
        String [] arr = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<arr.length; i++){
            char [] c = arr[i].toCharArray();
                if (c[0] == '<' && c[c.length-1] == '>'){
                    arr[i] = "";
                }
        }
        for (String s : arr){
            builder.append(s).append(" ");
        }
        return builder.toString().trim();
    }

    // With regex
    public static String removeHtml(String text){
        return text.replaceAll("<[^>]+>", "");
    }


    public static void main(String[] args) {
        String text = "<p>This is <b>HTML</b> content.</p>";
        System.out.println(removeHtml(text));
    }
}
