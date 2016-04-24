package com.shail.designpatterns.creational.builder;

public class Document {

  // Required params
  private String authorName;
  private String title;

  // Optional params...
  private String documentType;
  private int numberOfPages;

  public Document(final DocumentBuilder documentBuilder) {
    authorName = documentBuilder.getAuthorName();
    title = documentBuilder.getTitle();
    documentType = documentBuilder.getDocumentType();
    numberOfPages = documentBuilder.getNumberOfPages();
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public String getDocumentType() {
    return documentType;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  @Override
  public String toString() {
    return "[Title:" + getTitle() + ",AuthorName:" + getAuthorName() + ",Type:" + getDocumentType()
        + ",Pages:" + getNumberOfPages() + "]";
  }



  public static class DocumentBuilder {

    private String authorName;
    private String title;

    // Optional params...
    private String documentType;
    private int numberOfPages;

    public DocumentBuilder(final String authorName, final String title) {
      this.authorName = authorName;
      this.title = title;
    }

    public void setDocumentType(String documentType) {
      this.documentType = documentType;
    }

    public void setNumberOfPages(int numberOfPages) {
      this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
      return authorName;
    }

    public String getTitle() {
      return title;
    }

    public String getDocumentType() {
      return documentType;
    }

    public int getNumberOfPages() {
      return numberOfPages;
    }


    public Document build() {
      return new Document(this);
    }

  }
}
