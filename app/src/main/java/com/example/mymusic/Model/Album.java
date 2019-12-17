package com.example.mymusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Album {

@SerializedName("IdAblbum")
@Expose
private String idAblbum;
@SerializedName("TenAlbum")
@Expose
private String tenAlbum;
@SerializedName("TencasiAlbum")
@Expose
private String tencasiAlbum;
@SerializedName("HinhanhAlbum")
@Expose
private String hinhanhAlbum;

public String getIdAblbum() {
return idAblbum;
}

public void setIdAblbum(String idAblbum) {
this.idAblbum = idAblbum;
}

public String getTenAlbum() {
return tenAlbum;
}

public void setTenAlbum(String tenAlbum) {
this.tenAlbum = tenAlbum;
}

public String getTencasiAlbum() {
return tencasiAlbum;
}

public void setTencasiAlbum(String tencasiAlbum) {
this.tencasiAlbum = tencasiAlbum;
}

public String getHinhanhAlbum() {
return hinhanhAlbum;
}

public void setHinhanhAlbum(String hinhanhAlbum) {
this.hinhanhAlbum = hinhanhAlbum;
}

}