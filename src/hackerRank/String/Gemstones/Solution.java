package hackerRank.String.Gemstones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private static HashSet<String> getStrings(String s) {
        return new HashSet<>(Arrays.asList(s.split("")));
    }

    private static int gemstones(String[] arr) {

        List<String> gemstone = new ArrayList<>();

        for (String s : arr) {
            if (gemstone.size() == 0) {
                gemstone = new ArrayList<>(getStrings(s));
            }
            gemstone = gemstone.stream().filter(getStrings(s)::contains).collect(Collectors.toList());
            if (gemstone.size() == 0) {
                return 0;
            }
        }

        return gemstone.size();
    }


    public static void main(String[] args) {
        String[] arr = new String[100];
        arr[0] = "molbapydxfbsbwqrrsmkebhxnphikeywkxoldawbojksdlfoqwrqjmkcylacxfdyclepprhbndmgocrdzcgr";
        arr[1] = "nlxchmhckrzrykxjxjpckaavztepfbizoqh";
        arr[2] = "kncchsgsraxnotgdgovptowzghodwqideluywpwmqbqbtanqs";
        arr[3] = "umgeeuabkcntumyaumlkwxiujbwe";
        arr[4] = "byzoraskmuugmyiuolhbipceizazlixgfkeuurppyczyt";
        arr[5] = "uiipcvbppdhxqufsubjijxgshnjsaupbydmmxye";
        arr[6] = "isspjpleqsbylekhnzhrskxzkidnbqfcfhtpvre";
        arr[7] = "zlqigedzwiwwplspaqhjwpuexzumvjnrozvsbbulwpfnebuxdndvxquzzbafhdcuuspycvvkfdyyivgbewuyktlfuyjbwgppn";
        arr[8] = "pjgwftnnncxprrbyipcmgelvcqcvstrfqufrdxkmwdfopdoksuujifccnulnsrxggfxuvipuybwebxgvwrntqxqtki";
        arr[9] = "dakrjdsebiuugxpvxyhrtmwhvyqdhvgirhoozuccqv";
        arr[10] = "dapqtivsemkgbkvvzqqfocnnlljjcpexhdotgvcghpkvxvgsbi";
        arr[11] = "uoxhgujpbdx";
        arr[12] = "fadkdvrmphfahixjqhnjfcnjrprcdcrxzehypqdcrululryixvxxcaujmcneokejgzlzhb";
        arr[13] = "ysvdszdswunopr";
        arr[14] = "mqzrjprgxdydstsecaccka";
        arr[15] = "ohfnzlmpnzsgbhnwalpdisjdmdjnyutlhjvkmfxnqpppwmrmeecwobspkcgewwuznazeazgmgfkkz";
        arr[16] = "ghgyohsdoctwssefhmx";
        arr[17] = "tgdssqslwvpaeepbjijwdndblqytfcbrvtmbunwgis";
        arr[18] = "hgwhxuoifqaejvqfylrtskttxecndsklahpcnslzdqlszrblkccpzzeviysjtwdbovkysdemfpdzysfwvwnxhdantaqje";
        arr[19] = "xywoisgainvwkvwcapsqcxmuaq";
        arr[20] = "jdixnjqrzyslmnfqfrghqaxhicdvrxgiwmnyiyrpommpsovaieqfrxbexxqmjqkhsobvwxgiciekqmkbpzhqogixiaylbnvnyt";
        arr[21] = "denwpvpwcmlbehqsubxjuyqcveaittwuprrddtpwwuuajgejqytkzvxvfodtsqfh";
        arr[22] = "eisznwbftcgugqipoaubovknajuxpukmmctiwoqejjx";
        arr[23] = "yzgmnsryucaossnqqvvdllqxelpfirerrhjtufopgekstqfnhuezoqoelijuelxqlsyjdyvevlgwrauyjuykvyyh";
        arr[24] = "xtawtlilznqeifuefpndryoooadegksbqqsstufxrgbompnuurp";
        arr[25] = "tkdd";
        arr[26] = "ozoiyyssyfiionfurrukyijyemqtvtaikuxkjkorc";
        arr[27] = "afquxvbjbufhbfdaa";
        arr[28] = "qpghetpapqkamlflwsfalrnmwveonsmmajfitpyeiuhefey";
        arr[29] = "isqndazqlsflpwksppqlrydmxporfgwuihlzekmoyhqkvdnrhgarftdmxtahgkaoqgankdjtloxw";
        arr[30] = "scegvdydyapvchvtqpbqexsszpvtaooklvzoyjackwsbualovxzpqszjwnaosvggwqdbeimckcphayglqqpiwldihhtwwrcxc";
        arr[31] = "rclqhxyerjqnnldhoydjoqwdjbearqncoyhpfwxlwdqaexwkkqxvnssauidmjpzrverapnt";
        arr[32] = "xdpdfvyrorbxyufiesqjocilsdqbmwuppsndpltoj";
        arr[33] = "xmmwerdaejowqcoyppqxkulnixv";
        arr[34] = "frfuyubib";
        arr[35] = "gbmscibkxcwongfiuxjiodpunvgeacoxwsszcpfwfhaxjqpzrpggfotdmpuzdabdtwucqfiypnxlpvneghiklbhtfys";
        arr[36] = "kjdvelptpvaplankxqhymzuqqzgyhsetuviklvapgvntumwcgmpndmhavdvcmuznibkwvzvhvhmuztvkuxfwpytaahcmnany";
        arr[37] = "whbmaxzhpdjssrizf";
        arr[38] = "bpgdjecunkvwbcqjpmjjjcznzxcjvjafhz";
        arr[39] = "rffbbdlwbsnimcovwtohvzrikz";
        arr[40] = "foqthutowjvmtnisaccicvwpdxbjtaiqghkwyatwfktnsrcddjqcschxkrenynxabtnbzcjjjecitj";
        arr[41] = "cbzittqjnqqzvommsfqguhxaszs";
        arr[42] = "fjkpoosusdmdzatxvtvphrsdqhyshayhsqbferiaghdlxhfztsutmoqqygdnoupmonqytfytgotdtaba";
        arr[43] = "wpfqqvaqluzdhzkpmgswdvxjuzkutvpjsd";
        arr[44] = "rmxdtfsnmhzxarihwhiohawlprlxqgveljodgnritxhkanclchxojcbdoezwbvczmctxamfmzossiuncjvvglcliybzdfhfjmxm";
        arr[45] = "recvh";
        arr[46] = "pzxyjcaskyuspggefjiiefygvsubqgdjddmimqyclhqoicaarnmomzluignzv";
        arr[47] = "ixiginhofthorgfdqxhpwhcipzpyjarayvjrophsy";
        arr[48] = "jrkmxoxkwgmtadcdidwdqltr";
        arr[49] = "fjknnfplfeuqjvaomrpicsanzlqpiagxjqktjacigdyvrrdableynzdjbegpobnmncpel";
        arr[50] = "rfxpdrrxwjgzlnxrlgmaxatuyvwtsigvmsujzkmeeyqxaeszqzmpxzifbjlyehkyxyxazyfs";
        arr[51] = "srytftrlukcsjfauvjblwxady";
        arr[52] = "rjinbceyetioovkl";
        arr[53] = "xizeysjxwijafdajuapjiqqt";
        arr[54] = "exeoazqiaflhdyqrcqzgolzvnlolctovpwxaszdwqbudevfxnrtgqkopnacoktgiyltol";
        arr[55] = "xwduiwucgmejfhqyfzzwfghhawuobqiqsyiwuxcdmjjvubgmpzgskdconpgmlmzuul";
        arr[56] = "zxktqbewcftuxlnjllcyuirbynvjvgrxgmtjmuxurdcbrplgcekxli";
        arr[57] = "jqabapyvxqaxel";
        arr[58] = "zxtnsilxitwfrldfrokyqxtwtqieuafritwbmelqwvsmv";
        arr[59] = "orzlanudieytiyshqwepppjhfttplslvuionxwjkxvovkikbetzxnvxeasd";
        arr[60] = "gdnbibylvehbacqoobmpqqegktdunqisdvnrdkpnovmgtxaslargjetvkvaxilriltbffwetecswbapatfmiajvszwcj";
        arr[61] = "yykcigkuummaajzlshdjrrnhcylglduarmidtcevfefpzvvjapxsnkuvfxcrdikote";
        arr[62] = "vaucjluizqufovibbscbxodvjnltdpueexcnlowvpdpdd";
        arr[63] = "bkyjpzclqdllcjuteoovbkhfpnujmrieswhijgckmzupmi";
        arr[64] = "cgwpfdcczmjoukwgzblwkzeialiaquytddsxykjzuvgcpxarybemgtjcypgplcysygtkobxoahmraanptnoczzqbexqci";
        arr[65] = "veeqplrkdrelaqpkyigfvhptckbhkrfyzmmyklethcrjkpebvfadoohzbmahlrsbyaiemuophctsujnivpuunzixsqjvtjqkzowl";
        arr[66] = "wfaupbyrknrclwxscdkbzucxkkkiaqmrrffxcvduxaeckgnenxpsliqspeirlhzavntrs";
        arr[67] = "xagdvsafjqtalhjkggkholwwkqgpbbiywjkfywkwpsqheuiswwswtqlkttgiebbkqc";
        arr[68] = "hxttlfkksbkeuyecyosbypwxkhntvoahdmtiufsq";
        arr[69] = "qqfpddvvppasrtcfvosopkztmdkuqvvcoazmlmbmurfygtidqotuic";
        arr[70] = "qjutcdcmcunpvog";
        arr[71] = "evhamwhhsnykiljvavygsvnangcigryhlelpjgyjnjlandrzssdgvikvzdohqhlaurofifzvebpujphgvrbokdfebwyq";
        arr[72] = "wfivvvfldimgsjsrcdtycgacdoglvnewgxhhiuwokridoekcuyacvnayfnoknrnkrselctythmydi";
        arr[73] = "pphgchgrijktavtjnmrnupfeluhxjebnxlpoxyjbbgenwciwfhvxgvttobpeqjiukhrjyzcagssgq";
        arr[74] = "tpcmdefgtuubqeaegyiuzvhmascziejzhhwkawpovvsaxdqpihfurautqxpgzidwobgorvggqqavzkyhltfazakcl";
        arr[75] = "wyuwctuvrqmdbfwhuvtucedbnxvuyruvldbfdtvmqdeuvgocnpeainawbsx";
        arr[76] = "slxdpbpfkrikdmorptsqdldevabbqkliuslgjyohegwnapbgtyfkkumactoahrzfwgrpqjjucyd";
        arr[77] = "jldmqsoelsxywgvsfufgxg";
        arr[78] = "ghbnucihsadzkpy";
        arr[79] = "vrwjzikpcpjlrlmavowazfznyngrertieeiqgfzijetpjackkhaqojunyg";
        arr[80] = "znmnauzmgtqevrxpcyjnoxtchokbmeicjarhvmmgjtf";
        arr[81] = "fkbgjxsjugvpxhujlebqtgalzvwdjhozetvbhbcvrstpkdctqxketolumjgsbaowzs";
        arr[82] = "nieqzi";
        arr[83] = "yrtdurupovoyp";
        arr[84] = "mtpomwlfpyrjbwmja";
        arr[85] = "njqapnjfiypiwwjoqalixpabemathenjbbmtkekyvhxyapoysghfbxjvurzztbmaugpasnlxkpoghdojjkwjobzfwnpx";
        arr[86] = "sqtxpsorwjmsmcsaxrtubnzzygoajghxpupqvuqzlcqijqgifxpck";
        arr[87] = "nptxfbqooamgpuwytpzjpyxvodwtmloihqlkntmmxnbxyzjklboxihbpabwipgfgwg";
        arr[88] = "jmsfcdhhnjhtwpydrlfebklt";
        arr[89] = "jsocgwdahcrbyoyeqmhvaflecipghegqipbfxxzwvzeuzvdzmdtqwuhqlivkzvzogwzwonttzzsbdpj";
        arr[90] = "ftsafsaqflaizwxqwicshndvuabcdkqlcywmhgsgktsyzqvndzeuyzknugmiaahemqgdg";
        arr[91] = "worxpvczg";
        arr[92] = "iimsmyieeexewpycleybgjyzazfjorjjqhrqpnvxliugznubtafyzepnjgjvasmszqzgnpy";
        arr[93] = "mthyflhsbtjsglljkzrlr";
        arr[94] = "nsxuyycyhfecp";
        arr[95] = "tahohwbsaxheobchdaqagcalwztpvxgillqyeejjpgkhcpwmiygykkognriupmhorkmrjwkuhhazfalasynnxxelokex";
        arr[96] = "ezstlufuhdzgwt";
        arr[97] = "bcgiuolagphwputkbskhrbteqzrwyueoziifuuwomuaysppfqrixerdsozsvxkgloqv";
        arr[98] = "byhfdbczevofwifgjcmwqyuegmiaojweegluwuhnrdpohtmrnrbbnyuvasvupfxzlyuhgmyjiartvvsuib";
        arr[99] = "zxyfrjrpcjusrhjwmpkrongut";

        int result = gemstones(arr);
        System.out.println(result);
    }
}