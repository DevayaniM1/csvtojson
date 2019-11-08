package csvtojson11;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class csvtojson {
    static String[] headers = {"status", "taxrate", "standardprice","suppproductid"};
    static String[] val = {"Initiate", "0.08", "202.5","USAMERPOWS8989890"};
    static String[] headers1 = {"suppuniversalid", "suppcurrency", "manufacturerpartnumber","contextlistchange","suppcreateddate","isdiscontinued"};
    static String[] val1 = {"888466","USD","USAMERPOWS8989890","2019-10-03T03:30:41.381-0500","2019-10-03","false"};


    public static void main(String[] args) {
        JsonObject json =new JsonObject();
        JsonObject j =new JsonObject();
        JsonArray arr=new JsonArray();
        JsonObject j1=new JsonObject();
        JsonObject j2=new JsonObject();
        JsonObject j3=new JsonObject();
      //  JsonObject j4=new JsonObject();



        json.addProperty("id","ersyp8fgFEyN1Ir");
        json.addProperty("name","Cobra Power Inverters 899999 Power sales");
        json.addProperty("type","suppliersku");
        arr.add(j2);
        j2.add("contents",j3);
        j3.addProperty("country","unitedstates");


        j.add("contexts",arr);

        json.add("data",j);
        JsonObject j7=new JsonObject();

        JsonObject j4=new JsonObject();
        JsonObject j5=new JsonObject();
        JsonObject j41=new JsonObject();
        JsonObject j71=new JsonObject();



        j.add("attributes",j41);
        for(int i=0;i<headers1.length;i++){
            JsonArray arr11=new JsonArray();

            JsonObject j61=new JsonObject();
            j61.addProperty("source","internal");
            j61.addProperty("locale","en-US");
            j61.addProperty("id","76e2b6d2-3777-424f-9282-7a04d6b3be28");
            j61.addProperty("os","contextCoalescel");
            j61.addProperty("osid","ersyp8fgFEyN1Ir");
            j61.addProperty("ostype","suppliersku");
            j61.addProperty("osctxpath","self@@self");
            j61.addProperty("value",val1[i]);
            arr11.add(j61);
            j71.add("values",arr11);
            j41.add(headers1[i],j7);


        }





        JsonObject rel=new JsonObject();
        JsonArray rela1=new JsonArray();
        JsonObject rel11=new JsonObject();
        JsonObject rel12=new JsonObject();
        JsonObject rel13=new JsonObject();
        JsonObject rel14=new JsonObject();
        JsonObject rel15=new JsonObject();


        rel12.add("relTo",rel13);
        rel13.addProperty("id","54159dc5-e944-4d66-b4bd-5f164393b349");
        rel13.addProperty("type","workhuman");
        rel12.add("attributes",rel14);
        rel14.add("iseligible",rel15);
        rel15.addProperty("id","63552d26-0c63-40a5-9da5-3de0ea0d14d6");


        rel.add("skuproduct",rela1);
      //  rela1.add(rel11);
        rela1.add(rel12);


        for(int i=0;i<headers.length;i++){
          JsonArray arr1=new JsonArray();

       JsonObject j6=new JsonObject();
        j6.addProperty("source","internal");
            j6.addProperty("locale","en-US");
            j6.addProperty("id","76e2b6d2-3777-424f-9282-7a04d6b3be28");
            j6.addProperty("os","contextCoalescel");
            j6.addProperty("osid","ersyp8fgFEyN1Ir");
            j6.addProperty("ostype","suppliersku");
            j6.addProperty("osctxpath","self@@self");
            j6.addProperty("value",val[i]);
            arr1.add(j6);
            j7.add("values",arr1);
            j4.add(headers[i],j7);


        }
        j4.add("relationships",rel);
        arr.add(j4);
        JsonObject js=new JsonObject();

        System.out.println(json);
    }

        }



