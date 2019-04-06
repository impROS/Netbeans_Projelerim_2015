
package youtubevideo;


import java.io.Serializable;
import java.util.List;

import com.google.gdata.data.DateTime;
import com.google.gdata.data.media.mediarss.MediaCategory;
import com.google.gdata.data.media.mediarss.MediaThumbnail;
import com.google.gdata.data.youtube.VideoEntry;
import com.google.gdata.data.youtube.YouTubeMediaGroup;

public class YouTubeVideo implements Serializable {

    private static final long serialVersionUID = -5587449157496109153L;

    private String title;
    private String id;
    private Long duration;
    private String published;
    private Integer rating;
    private String firstThumb;
    private String extraInfo;
    private String uploader;
    private long viewCount;
    private String cat;

    public static void main(String[] args) {
        VideoEntry youLink = new VideoEntry("thk64emxwjo");
        YouTubeVideo youClass = new  YouTubeVideo(youLink);
    }
    public YouTubeVideo(VideoEntry e) {

        // Id
        id = e.getId();
        System.out.println(id);
        // Title
        title = e.getTitle().getPlainText();
        System.out.println(title);
        // Category
        cat = getFirstCategory(e);

        // Uploader
        uploader = e.getMediaGroup().getUploader();

        // Duration
        duration = e.getMediaGroup().getDuration();

        // Published
        published = e.getPublished() != null ? e.getPublished().toUiString()
                : "-";

        // View count
        viewCount = e.getStatistics() != null ? e.getStatistics()
                .getViewCount() : 0;

        // Rating
        rating = e.getRating() != null? e.getRating().getAverage().intValue(): 0;

        // Thumbnail
        firstThumb = getFirstThumb(e);

        // Extrainfo
        extraInfo = getExtraInfo(e);

    }

    private static String getFirstCategory(VideoEntry e) {
        YouTubeMediaGroup mg = e.getMediaGroup();
        MediaCategory fcat = mg.getCategories() != null
                && mg.getCategories().size() > 0 ? mg.getCategories().get(0)
                : null;
        return fcat != null? fcat.getLabel(): "-";
    }

    private static String getExtraInfo(VideoEntry e) {
        if (e.getMediaGroup() != null
                && e.getMediaGroup().getCategories() != null) {
            List<MediaCategory> cats = e.getMediaGroup().getCategories();
            String ei = "";
            for (int i = 0; i < cats.size(); i++) {
                MediaCategory cat = cats.get(i);
                if (cat != null) {
                    ei += i > 0 ? " - " + cat.getLabel() : cat
                            .getLabel();
                }
            }
            return ei;
        }
        return "";
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public long getDuration() {
        return duration;
    }

    public String getFormattedDuration() {
        return formatDuration(duration);
    }

    public static String formatDuration(Long dur) {
        if (dur == null) {
            return "0:00";
        }

        int min = (int) Math.floor(dur.floatValue() / 60);
        int sec = dur.intValue() - (60 * min);
        return min + ":" + (sec < 10 ? ("0" + sec) : sec);
    }

    public static String formatDate(DateTime date) {
        if (date == null) {
            return "-";
        }
        return date.toUiString();
    }

    public static String formatRating(Integer rating) {
        if (rating == null ) {
            return "";
        }
        String ratingStr = "";
        for (int i = 1; i < 6; i++) {
            if (i <= rating.intValue()) {
                ratingStr += "â˜…";
            } else {
                ratingStr += "âœ©";
            }

        }
        return ratingStr;
    }

    /** Get the first thumbnail entry, if available. */
    public static String getFirstThumb(VideoEntry e) {
        YouTubeMediaGroup g = e.getMediaGroup();
        if (g == null) {
            return null;
        }
        List<MediaThumbnail> t = g.getThumbnails();
        if (t == null || t.size() < 1) {
            return null;
        }
        return t.get(0).getUrl();
    }

    public String getThumbURL() {
        return firstThumb;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public String getUploader() {
        return uploader;
    }

    public String getFormattedPublished() {
        return published;
    }

    public long getViewCount() {
        return viewCount;
    }

    public Integer getRating() {
        return rating;
    }
    public String getFormattedRating() {
        return formatRating(rating);
    }

    public String getCat() {
        return cat;
    }

}
