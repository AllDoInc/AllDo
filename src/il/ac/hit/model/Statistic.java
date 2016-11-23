package il.ac.hit.model;


/**
 * 
 * @author Efi Shimon
 *this class hold the statistic for users to check their preformence with finishing tasks
 *this class will eneble tracking preformence and will show user overall rates (if the user will want this fiture)
 */
public class Statistic 
{
	Integer completedInTime;
	Integer completedAfterTime;
	Integer delaydEndTime;
	Integer notFinished;
	Integer archivedWithoutFinishing;

	Double completeRatio;
	Double delayRatio;
	
	DateAndTime statisticTime;
}
