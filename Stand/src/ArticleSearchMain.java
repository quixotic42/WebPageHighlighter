import java.io.IOException;

import team.misc.ArticleSearchRunner;


public class ArticleSearchMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ArticleSearchRunner.runArticleSearch("https://medium.com/cuepoint/a-sxsw-music-2015-postmortem-report-1a59e23ddddc"));
	}
}
