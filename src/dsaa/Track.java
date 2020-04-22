/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaa;

/**
 *
 * @author joshq
 */
public class Track {
    
    private int TrackID;
    private String TrackTitle;
    private String Artist;
    private int TrackLength;
    private String Composer;
    private String ReleaseDate;
    private String Album;
    private String Genre;
   
    
    //getters
    
    public int getTrackID()
    {
        return TrackID;
    }
    
    public String getTrackTitle()
    {
        return TrackTitle;
    }
    
    public String getArtist()
    {
        return Artist;
    }
    
    public String getComposer()
    {
        return Composer;
    }
    
    public String getReleaseDate()
    {
        return ReleaseDate;
    }
     public int getTrackLength()
    {
        return TrackLength;
    }
    
    public String getAlbum()
    {
        return Album;
    }
    
    public String getGenre()
    {
        return Genre;
    }
    
    //setters
    
     public void setTrackID(int NewTrackID)
    {
        TrackID = NewTrackID;
    }
    
    public void setTrackTitle(String NewTrackTitle)
    {
        TrackTitle = NewTrackTitle;
    }
     
     public void setArtist(String NewArtist)
    {
        Artist = NewArtist;
    } 
    
     public void setTrackLength(int NewTrackLength)
    {
        TrackLength = NewTrackLength;
    }
     
     public void setComposer(String NewComposer)
    {
        Composer = NewComposer;
    } 
      public void setReleaseDate(String NewReleaseDate)
    {
        ReleaseDate = NewReleaseDate;
    } 
       public void setAlbum(String NewAlbum)
    {
        Album = NewAlbum;
    } 
        public void setGenre(String NewGenre)
    {
        Genre = NewGenre;
    } 
}
