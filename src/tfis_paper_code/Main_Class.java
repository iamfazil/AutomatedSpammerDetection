package tfis_paper_code;

import java.io.IOException;

public class Main_Class {

	public static void main(String []args) throws IOException, InterruptedException{
		
		//Execute the method whichever feature values are required
		
		//Metadata-Based Features
		
		//Execute this method to calculate the retweet ratio
		/*Metadata_Category.retweetRatio();
		//Execute this method to compute the automated tweet ratio
		Metadata_Category.automatedTweetRatio();
		//Execute the below two methods in sequence to compute tweets-time interval standard deviation
		Metadata_Category.tweetsTimeIntervalAndTheirAverage();
		Metadata_Category.tweetsTimeIntervalStandardDeviation();
		//Execute this method to compute the tweets-time standard deviation
		Metadata_Category.tweetsTimeStandardDeviation();*/
		
		
		//Content-Based Features
		
		//Execute this method to compute the UR, UUR, MR, UMR, HTR features
		//Content_Category.UR_MR_UUR_UMR_HTR();
		//Execute this method to calculate the similarity between the hashtag and tweets of users
		/*Content_Category.tweetHashtagSimilarityRatio();
		//Execute this method to compute the AUR and ATS features
		Content_Category.AUR_ATS();
		
		//Interaction-Based Features
		
		//Execute this method to compute the reputation and follower ratio
		Interaction_Category.reputation_and_followerRatio();
		//Execute this method to compute clustering coefficient
		Interaction_Category.clus_coefficient();
		//Execute the below two methods in sequence to compute follower-based reputation
		Interaction_Category.Friends_Fol_And_Neighbors_Flng_Extraction();
		Interaction_Category.followerBasedReputation();
		//Execute this method to compute mean followers following to follower ratio
		Interaction_Category.meanFollowersFollowingToFollowerRatio();
		
		//Community-Based Features
		
		//Execute the below three methods in sequence to compute community-based users' reputation
		//After executing followersFolllowersAndFollowings(), pass its output to CONCLUDE algorithm to find the communities of every user
		Community_Category.followersFolllowersAndFollowings();
		Community_Category.communityUsersReputation();
		Community_Category.communityBasedUsersReputation();*/
		
		//Execute this method to compute community-based clustering coefficient
		//Community_Category.communityBasedClusteringCoefficient();
	}
}
