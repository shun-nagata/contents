package javaprog.worksheet.lec06;

class Rate {
  String country;
  float rate;
  String unit;

  Rate(String country, float rate, String unit) {
    this.country = country;
    this.rate = rate;
    this.unit = unit;
  }

  String exchange(int yen) {
    float money = yen * rate;
    return country + "：" + money + unit;
  }
}
