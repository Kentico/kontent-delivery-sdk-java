package com.dancinggoat.models;

import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;
import kentico.kontent.delivery.Asset;
import kentico.kontent.delivery.ContentItem;
import kentico.kontent.delivery.ContentItemMapping;
import kentico.kontent.delivery.ElementMapping;
import kentico.kontent.delivery.System;
import kentico.kontent.delivery.Taxonomy;

/**
 * This code was generated by a <a href="https://github.com/Kentico/cloud-generators-java">cloud-generators-java tool</a>
 *
 * Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 * For further modifications of the class, create a separate file and extend this class.
 */
@ContentItemMapping("article")
public class Article {
  @ElementMapping("personas")
  List<Taxonomy> personas;

  @ElementMapping("title")
  String title;

  @ElementMapping("teaser_image")
  List<Asset> teaserImage;

  @ElementMapping("post_date")
  ZonedDateTime postDate;

  @ElementMapping("summary")
  String summary;

  @ElementMapping("body_copy")
  String bodyCopy;

  @ContentItemMapping("related_articles")
  List<ContentItem> relatedArticles;

  @ElementMapping("meta_keywords")
  String metaKeywords;

  @ElementMapping("meta_description")
  String metaDescription;

  @ElementMapping("color")
  String color;

  System system;

  public List<Taxonomy> getPersonas() {
    return personas;
  }

  public void setPersonas(List<Taxonomy> personas) {
    this.personas = personas;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Asset> getTeaserImage() {
    return teaserImage;
  }

  public void setTeaserImage(List<Asset> teaserImage) {
    this.teaserImage = teaserImage;
  }

  public ZonedDateTime getPostDate() {
    return postDate;
  }

  public void setPostDate(ZonedDateTime postDate) {
    this.postDate = postDate;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getBodyCopy() {
    return bodyCopy;
  }

  public void setBodyCopy(String bodyCopy) {
    this.bodyCopy = bodyCopy;
  }

  public List<ContentItem> getRelatedArticles() {
    return relatedArticles;
  }

  public void setRelatedArticles(List<ContentItem> relatedArticles) {
    this.relatedArticles = relatedArticles;
  }

  public String getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }
}
