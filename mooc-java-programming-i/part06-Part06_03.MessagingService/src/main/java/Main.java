
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message ms = new Message("James", "ajnfnenf;owahiuf;oauinc;oin;vouhew;oango;" +
                "andv;oienaf;ovicn;oeiufh;ouBVC;BE;FOUBJNMOLN;MOZUNM;OUJNM;OJN;onm;ounm;uomnb;onm;oun" +
                "usbefliueblifubcojnOIUQWHND;OC;OIW;OIAWNCUONEIFJIWKNDCOAINnicbnewuibfv;awbncv;ouf" +
                "nubvciuBc;jnbA:OWUJBNC;oubnAW;fonb;eoinv;on:OIN:OINWC;kncn'PNC''pnc'aoipsefwIOnAWIFN" +
                "ncoiuN:WOInc ;cioncmmk'poWd'wmc;xiopjhsmgfo;ihzsemnf;oihaemf;onv;oiu hfn;ouIAHMkjnjn" +
                "njusbfibfnliuabmdlxuba mzflbcvflisubfmliubzm lzifsmfl izfxajfn ksujbng k,jfbgmxlksurgbnml" +
                "ujgbmliusrhbgmlxiurmglxuasmgx;oaumf;oaenfmx;ouenfglcbgmxuobgm;oauhmbfx;aoufhbmnnx;uaojefhx mn;U");

        Message ms2 = new Message("James", "This is another message");
        Message ms3 = new Message("Tom", "My name is Tom...Hooray!!!");

        MessagingService service = new MessagingService();
        service.add(ms);
        service.add(ms2);
        service.add(ms3);
        System.out.println(service.getMessages());
        System.out.println(service);
    }
}