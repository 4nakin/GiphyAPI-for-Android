package com.acdroid.giphyapi.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Bean with the info retrieved from the server
 * 
 * @author Marcos Trujillo 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GiphyInfo {
    @JsonProperty("data")
    public ArrayList<GifInfo> gifList= new ArrayList<GifInfo>();
    @JsonProperty("meta")
    public Meta meta;
	
	
    @JsonIgnoreProperties(ignoreUnknown = true)
	public static class GifInfo{
        @JsonProperty("type")
        public String type;
        @JsonProperty("id")
        public String id;
        @JsonProperty("url")
        public String url;
        @JsonProperty("bitly_gif_url")
        public String urlBitly;
        @JsonProperty("bitly_fullscreen_url")
        public String urlBitlyUrl;
        @JsonProperty("bitly_tiled_url")
        public String urlBitlyTiled;
        @JsonProperty("embed_url")
        public String urlEmbed;
        @JsonProperty("import_date")
        public String importDate;
        @JsonProperty("images")
        public GifImages gifImages;
        
        
        @Override
        public String toString() {
            return "GifInfo [type=" + type + ", id=" + id + ", url=" + url + ", urlBitly="
                    + urlBitly + ", urlBitlyUrl=" + urlBitlyUrl + ", urlBitlyTiled="
                    + urlBitlyTiled + ", urlEmbed=" + urlEmbed + ", importDate=" + importDate
                    + ", gifImages=" + gifImages + "]";
        }
	}
    
    /**
     * 
     * @author Marcos Trujillo 
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GifImages{
        @JsonProperty("fixed_height")
        public GifImages imageFixedHeight;
        @JsonProperty("fixed_height_still")
        public GifImages imageFixedHeightStill;
        @JsonProperty("fixed_width")
        public GifImages imageFixedWidth;
        @JsonProperty("fixed_width_still")
        public GifImages imagFixedWidthStill;
        @JsonProperty("original")
        public GifImages imageOriginal;
        
        
        @Override
        public String toString() {
            return "GifImages [imageFixedHeight=" + imageFixedHeight + ", imageFixedHeightStill="
                    + imageFixedHeightStill + ", imageFixedWidth=" + imageFixedWidth
                    + ", imagFixedWidthStill=" + imagFixedWidthStill + ", imageOriginal="
                    + imageOriginal + "]";
        }
    }
    
    /**
     * 
     * @author Marcos Trujillo 
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GifImage{
        @JsonProperty("url")
        private String url;
        @JsonProperty("width")
        private String width;
        @JsonProperty("height")
        private String height;
        
        public String getUrl() {
            return url;
        }
        
        public void setUrl(String url) {
            this.url = url;
        }
        
        public int getWidth() {
            try{
                return Integer.parseInt(width);
            }
            catch (Exception e) {
                return 0;
            }
        }
        
        public void setWidth(String width) {
            this.width = width;
        }
        
        public void setWidth(int width) {
            this.width = "" + width;
        }
        
        public int getHeight() {
            try{
                return Integer.parseInt(height);
            }
            catch (Exception e) {
                return 0;
            }
        }
        
        public void setHeight(String height) {
            this.height = height;
        }
        
        public void setHeight(int height) {
            this.height = "" + height;
        }

        @Override
        public String toString() {
            return "GifImage [url=" + url + ", width=" + width + ", height=" + height + "]";
        }
    }
    
    
    
    /**
     * Meta info of the GhiphyInfo
     * 
     * @author Marcos Trujillo
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Meta{
        @JsonProperty("msg")
        public String message;
        @JsonProperty("status")
        public int status;
        @JsonProperty("error_type")
        public Integer errorType;
        @JsonProperty("code")
        public Integer code;
        @JsonProperty("error_message")
        public String errorMessage;
        
        
        @Override
        public String toString() {
            return "Meta [message=" + message + ", status=" + status + ", errorType=" + errorType
                    + ", code=" + code + ", errorMessage=" + errorMessage + "]";
        }
    }
}
