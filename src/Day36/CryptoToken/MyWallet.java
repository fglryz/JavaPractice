package Day36.CryptoToken;

public class MyWallet {
    public static void main(String[] args) {


        Bitcoin MyBitcoin = new Bitcoin(34000.2, 4, 68.3, 5870500.4, 5467543.3, true);
        Bitcoin fromFather=new Bitcoin(43000,2,54,88605000,46545466457688f,true);
        Ethereum fromBro=new Ethereum(3400,1,5465465,546532,54676,true);
        Cardano fromMum=new Cardano(16,85,5465764,5498567,549879,false);
        XRP cameUnIntentionally=new XRP(0.82,100000,4646549832d,6546432,465486431,false);
        Doge fromGranPa=new Doge(0.14575,50000,5643546,456843,5246876,true);
        double totalAsset=fromFather.totalPrice()+fromBro.totalPrice()+fromMum.totalPrice()+cameUnIntentionally.totalPrice()+
                fromGranPa.totalPrice();

        System.out.println("My total Asset is : "+totalAsset);
    }
}