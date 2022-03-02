public class Tester {
public static void main (String[] args) {
  String namE1 = "Walter King";
  String iD1 = "244998019";
  //boolean isExpired =
  String currentDate1 = new String ("07/25/2023");
  String expirationDate1 = new String ("06/26/2022");
  Integer cyear1 = Integer.valueOf(currentDate1.substring(6));
  Integer eyear1 = Integer.valueOf(expirationDate1.substring(6));

  String namE2 = "Spike Kerry";
  String iD2 = "244567899";
  String currentDate2 = new String ("01/29/2026");
  String expirationDate2 = new String ("06/26/2022");
  Integer cyear2 = Integer.valueOf(currentDate2.substring(6));
  Integer eyear2 = Integer.valueOf(expirationDate2.substring(6));

  String namE3 = "Ace Brand";
  String iD3 = "244765435";
  String currentDate3 = new String ("11/21/2020");
  String expirationDate3 = new String ("06/26/2022");
  Integer cyear3 = Integer.valueOf(currentDate3.substring(6));
  Integer eyear3 = Integer.valueOf(expirationDate3.substring(6));

  MetroCard metrocard1 = new MetroCard("Walter King", "244998019");
  MetroCard metrocard2 = new MetroCard("Spike Kerry", "244567899");
  MetroCard metrocard3 = new MetroCard("Ace Brand", "244765435");

  if (eyear1 < cyear1) {
    System.out.println(metrocard1.getNamE() + " card is expired");
  }
  else {
    System.out.println(metrocard1.getNamE() + " got 2 more passes");
  }

  if (eyear2 < cyear2) {
    System.out.println(metrocard2.getNamE() + " card is expired");
  }
  else {
    System.out.println(metrocard2.getNamE() + " got 2 more passes");
  }
  if (eyear3 < cyear3) {
    System.out.println(metrocard3.getNamE() + " card is expired");
  }
  else {
    System.out.println(metrocard3.getNamE() + " got 2 more passes");
  }

    }
}
