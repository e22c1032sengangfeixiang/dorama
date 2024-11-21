import java.util.Scanner;
public class StudentList { 
	public static void main(String[] args){
		//変数，配列の準備
		int[] ids={2023,2018,2020,2015,2019,2022,2021,2016,2017,2014};
		String[] names={"キングダム 運命の炎","ちはやふる-結び-","AI崩壊","S-最後の警官- RECOVERY OF OUR FUTURE", "アクアマン","余命１０年","ブレイブ 群青戦記","青空エール","君の膵臓を食べたい","ベイマックス"};
		String[] monogatari= {"春秋戦国時代の中国。天下の大将軍を志す少年・信（山﨑賢人）は秦の若き国王・嬴政えいせい（吉澤亮）と運命的な出会いを果たし、ともに中華統一を目指すことに。魏との戦いに勝利をおさめた彼らのもとに、秦に対して積年の恨みを抱える隣国・趙の軍隊が攻め込んでくる。嬴政は長らく戦場から離れていた伝説の大将軍・王騎（大沢たかお）を総大将に任命。王騎から戦いへの覚悟を問われた嬴政は、かつての恩人・紫夏（杏）との記憶を語る。100人の兵士を率いる隊長となった信は、王騎から「飛信隊」という部隊名を授かり、別働隊として敵将を討つ任務に挑む。","瑞沢高校競技かるた部員の綾瀬千早（広瀬すず）と若宮詩暢（松岡茉優）が、全国大会で激闘を繰り広げてから2年。真島太一（野村周平）、綿谷新（新田真剣佑）らと共に名人・クイーン戦に挑む千早だったが、詩暢と戦えない自分の実力不足を痛感する。そんな中、千早たちの師匠・原田秀雄（國村隼）が史上最強の名人とされる周防久志（賀来賢人）に敗れてしまい、新が彼に挑戦状をたたきつける。その後3年生になった千早は、高校最後の全国大会に向けて動くが……。","舞台は（公開時点から10年後の）2030年。高齢化と格差社会が進展し、人口の4割が高齢者と生活保護者となり、医療人工知能 (AI) 「のぞみ」が全国民の個人情報などを管理していた。そんなある日、「のぞみ」が突如として暴走を開始、“人間の生きる価値”を勝手に選別し始め、生きる価値がないと判定された人間の殺戮を開始した。警察は「のぞみ」を暴走させたテロリストが「のぞみ」の開発者である天才科学者・桐生浩介だと断定。逃亡する桐生をAI監視システムを駆使して追跡する。事件のカギを握るのは、桐生と、「のぞみ」を管理していた桐生の義弟・西村悟。桐生は警察の追っ手から逃れながら、AIの暴走を阻止しようと奔走する。","向井理と綾野剛が警察庁と警視庁それぞれの特殊部隊に所属するライバル隊員を演じたTVドラマの劇場版。 ハイジャックしたプルトニウム積載巨大タンカーで日本全土を人質に取るテロリスト犯と“NPS”、“SAT”をはじめとする各特殊部隊の攻防を描く。","人間として育てられた、海底王国アトランティスの末裔にして、サメをはじめ海の生物すべてを従えて戦うことができる男、アクアマン。地上を超える未知の文明をもったアトランティス帝国が、人類の支配を狙い侵略を始めたとき、彼が守るのは――地上か、それとも海か。","20歳で不治の病にかかり、もう恋はしないと心に決めた余命10年の茉莉(小松菜奈)。生きることに迷い、自分の居場所を見失った和人(坂口健太郎)。同窓会で再会した2人は惹かれあい、ありふれた毎日が嘘みたいに輝き出す。思い出の数だけ失われていく時間……。彼らが最後に選んだ道とは？","退屈な授業と、常勝を義務付けられた部活動。弓道部の蒼（新田真剣佑）は目立つのが苦手で、弓道場で日々練習に打ち込むばかり。幼なじみの遥（山崎紘菜）は、そんな蒼のことを心配していた。ある日、落雷をきっかけに校庭の向こうには城がそびえ立ち、校内には刀を持った野武士がなだれ込み、校内はパニックに。そんな中、歴史オタクの蒼は学校がまるごと戦国時代へ、「桶狭間の戦い」の直前までタイムスリップしてしまったことに気付く。かの有名な織田信長（松山ケンイチ）の軍勢に仲間たちを連れ去られた蒼は、後に徳川家康となって天下統一を果たす武将の（三浦春馬）とともに、野球部やアメフト部から集まった選抜メンバーと立ち上がる。","野球と吹奏楽の名門・白翔高校に入学した小野つばさは、野球部のトロフィーを眺めていた野球部員の山田大介と出会う。 吹奏楽部に憧れるつばさは、「甲子園で戦う大介をスタンドで応援する」と約束を交わし、その約束を実現させるため、2人は互いに惹かれあいながらも、それぞれの部活動に邁進していく。","高校時代のクラスメイト・山内桜良の言葉をきっかけに教師となった“僕”は、教え子の栗山と話すうちに、桜良と過ごした数カ月間の思い出をよみがえらせていく。 高校時代の“僕”は、膵臓の病を抱える桜良の秘密の闘病日記を見つけたことをきっかけに、桜良と一緒に過ごすようになる。 そして桜良の死から12年後、彼女の親友だった恭子もまた、結婚を目前に控え、桜良と過ごした日々を思い出していた。","幼い頃に両親を亡くした少年ヒロ。 彼の味方は、優しさと愛情を惜しみなく注いでくれる兄のタダシひとり。 だが、唯一にして最愛の存在であった兄は謎の爆発事故で帰らぬ人に…。 大きすぎる心の傷を負い、悲しみに深く心を閉ざしたヒロの前に突如現れたのは、空気で膨らんだ白くて大きな体を持つ＜ベイマックス＞。"};
		String[] kansou={"前作の作品よりもスケールがとても大きくなっていて驚かされたのと、見ていてハラハラドキドキする面白い作品でした。","青春がギュッと詰まった完結編で、全員が主役であり、人間愛が深いとてもいい作品でした。","カタチを持たぬAIだから、どう表現するかは見もので、その辺りのネットワークのスケール感は現実になりそうで、いい具合にリアルで面白い作品だった。","アクションもいいし、スピード感もあり、邦画にしては十分楽しめた。映画ならではの迫力もあり、見ごたえがありました。カッコいいだけを全面に出しているのではなくそれぞれの人物の真摯な一生懸命さや情愛が感じられ自然と涙があふれてくる作品でした。","アクションシーンが迫力満点で特に女性陣のアクションが印象的であり、ロマンスとアクションのバランスが良く、ストーリー展開が早く飽きさせない、映像美な素晴らしい作品でした。", "病人か病人以外どっちが辛いのかってのは沁みたし、四季の描写もわくわくするほど映像が美しく特に雪のシーンが心に残り、台詞がとても胸に刺さる素晴らしい愛に溢れた作品でした。","現代のトップアスリート高校生と戦国の武士が戦う設定が面白く、殺陣シーンが迫力あり、それぞれ部活動の強みを活かしていて、キャスト全員の存在感がすごい作品でした。","登場人物が一生懸命でアツく、応援の力が人を変えることを実感し、部活動の熱い努力が感動的で青春物としてオススメな作品でした。","毎日を悔いなく過ごそうというメッセージが心に響く、涙腺崩壊必死の感動作品でした。","日本の文化とアメリカの文化が上手くブレンドされていて、アクションシーンも多くテンポもよくて、ベイマックスの愛らしさと包容力が伝わる感動するストーリーな作品でした。"};
		String[] kantoku={"佐藤信介","小泉徳宏","入江悠","平野俊一","ジェームズ・ワン","藤井道人","本広克行","三木孝浩","月川翔","ドン・ホール"};
		String[] syuenn={"山﨑賢人","広瀬すず","大沢たかお","向井理","ジェイソン・モモア","小松菜奈","新田真剣佑","土屋太鳳","浜辺美波","ジェームズ・クロムウェル"};
		String[] syudaika={"宇多田ヒカル「Gold～また逢う日まで」","Perfume「無限未来」","AI「僕らを待つ場所」","MISIA「流れ星」","Skylar Grey「Everything I Need」","RADWIMPS「うるうびと」","UVERworld「HOURGLASS」","whiteeeen「キセキ 未来へ」","Mr.Children「himawari」","AI「story」"};	
		int i;
		//検索値の入力（スキャナの準備）
		System.out.println("入力された公開年から映画の名前を検索します");
		Scanner sc = new Scanner(System.in);
		System.out.println("映画の公開年を入力してください");
		int n = sc.nextInt();
		if(n==0){
		  return;
		}
		//検索
		for(i=0;i<ids.length;i++){
			if(n==ids[i]) break;	//｛ ｝波括弧は省略
		}
		//表示
		if(i==ids.length){		//ループが回りきって終了した場合
			System.out.println("検索の結果、該当する公開日の映画はいません");
		}else{				//ループがbreakで終了した場合
			System.out.println("=========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			System.out.println(""+n+"年に公開された「"+names[i]+"」。この物語は、"+monogatari[i] );
			System.out.println("視聴した感想は「"+kansou[i]+"」");
			System.out.println("監督をされた方は「"+kantoku[i]+"」。");
			System.out.println("主演を演じられた方は「"+syuenn[i]+"」。");
			System.out.println("主題歌は「"+syudaika[i]+"」。");
			System.out.println("=========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		
		}
	}
}