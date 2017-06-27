class Parcel {
  public String mName;
  public int mLength;
  public int mWidth;
  public int mHeight;
  public int mWeight;
  public int mTotalCost;

  public Parcel(String name, int length, int width, int height, int weight) {
    mName = name;
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mTotalCost = 0;
  }

  public int calculateVolume(int length, int width, int height) {
    return (length * width * height);
  }

  public int costToShip(int volume, int weight) {
    return ((volume / 10) + (weight / 2));
  }
}
