import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class doramaList{
	public static void main(String[] args){
		//変数, 配列の準備
	    int[] ids={};
        String[] names={""};
        String[] monogatari= {""};
        String[] Jyannru={""};
        String[] kansou={""};
        String[] kantoku={""};
        String[] syuenn={""};
        String[] syudaika={""};	
        int i;
        //検索値の入力（スキャナの準備）
        System.out.println("入力された放送年からドラマのタイトルを検索します");
        Scanner sc = new Scanner(System.in);
        System.out.println("ドラマの放送された年を入力してください");
        int n = sc.nextInt();
        if(n==0){
          return;
        }
        //検索
        for(i=0;i<ids.length;i++){
        	if(n==ids[i]) break;   // { } 波括弧は省略
        }
        //表示
        if(i==ids.length){		//ループが回りきって終了した場合
        	System.out.println("検索の結果 、該当する放送されたドラマはありません");
        }else{              //ループがbreakで終了した場合
        	System.out.println("=========================================================================================================================================");
        	System.out.println(""+n+"年に放送された 「"+names[i]+"＜この物語は、"+monogatari[i]);
        	System.out.println("このドラマのジャンル>>>>> 「"+Jyannru[i]+"」");
        	System.out.println("視聴した感想>>>>>>>>>>>"+kansou[i]+"");
        	System.out.println("監督>>>>>>>>> 「"+kantoku[i]+"」");
        	System.out.println("主演>>>>>>>>> 「"+syuenn[i]+"」");
        	System.out.println("主題歌>>>>>>>> 「"+syudaika[i]+"」");
        	System.out.println("===========================================================================================================================================");
        	String message1 ="ドラマ名・・・ 「"+names[i]+"」<この物語は、"+monogatari[i];
        	String message2 ="ジャンル・・・ 「"+Jyannru[i]+"」 感想・・・"+kansou[i]+"監督・・・ 「"+kantoku[i]+"";
        // 文字列を繋げて、保存用のデータをつくります。
		// "\n" は改行記号です。
        	String savedata = message1 + "\n" + message2;
        try {
        	// プロジェクトフォルダの data.txt というファイルに
			// データを保存します。
        	Files.writeString(Path.of("./data.txt"), savedata);
        } catch (IOException err) {
        	err.printStackTrace();
        }
        }
	}
}