class Parcel {
  public int mLength;
  public int mWidth;
  public int mHeight;
  public int mWeight;

  public Parcel(int length, int width, int height, int weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
  }

  public int calculateVolume(int length, int width, int height) {
    return (length * width * height);
  }

  public int costToShip(int volume, int weight) {
    return ((volume / 2) + (weight / 2));
  }

  public int twoDayShipping(int cost) {
    return (cost + 6);
  }

  public int giftWrapped(int cost) {
    return (cost + 2);
  }
}
