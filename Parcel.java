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
}
