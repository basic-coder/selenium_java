package DemoProject.test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
				
		//maximize browser
		//driver.manage().window().maximize();
		
		//wait 10 second
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//open url
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		int resCode = 200;
		int brokenLinkCount = 0;
		String Language = "hindi";
		
		ArrayList<String> brokenUrls = new ArrayList<String>();
		
		//find hyperlinks
		String[] linkList = {
			"https://www.iffcotokio.co.in/"+Language+"/other-insurance/claims",
			"https://www.iffcotokio.co.in/"+Language+"/other-insurance/restructured-weather-based-crop-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/other-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-is-the-difference-between-health-insurance-and-critical-illness-policies-or-critical-illness-riders-in-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-is-coverage-amount",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/is-natural-medicine-and-homeopathy-treatment-covered-under-a-health-policy",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-are-the-factors-that-determine-the-premium-payable-for-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-are-the-minimum-and-maximum-policy-periods",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/does-health-insurance-include-diagnostic-fees-such-as-x-rays-mris-or-ultrasounds",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/how-does-the-insurance-company-decide-if-a-disease-already-exists",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-happens-to-policy-coverage-after-the-claim-is-filed",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/my-employer-provides-me-health-insurance-coverage-is-it-appropriate-to-have-another-policy-of-my-own",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/can-i-avail-this-policy-if-i-am-not-an-indian-national-but-living-in-india",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/do-maternity-pregnancy-expenses-be-included-in-health-insurance-plans",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/if-the-policy-holder-dies-at-the-time-of-treatment-who-will-receive-the-claim-amount-under-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/is-a-medical-checkup-necessary-before-buying-a-policy",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/claims",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/are-there-any-tax-benefits-that-one-can-avail-while-buying-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/my-wife-and-children-live-in-mysore-while-i-am-in-bangalore-can-i-cover-all-of-us-in-one-policy",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-does-cashless-hospitalization-mean",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/can-i-buy-more-than-one-health-insurance-policy",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-is-the-maximum-number-of-fixed-claims-occurring-in-a-year",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-are-the-documents-required-to-purchase-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/is-mediclaim-the-same-as-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/who-is-the-third-party-administrator",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/what-happens-when-i-cancel-the-policy",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/i-am-young-and-healthy-do-i-really-need-health-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/is-there-a-waiting-period-when-my-expenses-will-not-be-assessed-in-any-contingency",
			"https://www.iffcotokio.co.in/"+Language+"/health-insurance/is-health-insurance-the-same-as-life-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/how-do-i-get-the-policy-after-applying",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-happens-in-case-of-death-of-insured-in-foreign-country",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/do-i-have-to-undergo-a-medical-test-before-purchasing-a-travel-insurance-policy",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/pravasi-bharatiya-bima-yojana",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/claims",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/will-i-pay-more-to-use-an-online-service-than-going-to-an-insurance-company-or-buying-through-an-insurance-agent",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/is-dental-treatment-covered-under-the-policy",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/international-travel-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-happens-in-case-of-loss-of-total-loss-of-checked-goods",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-is-the-benefit-of-buying-travel-insurance-online",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-are-the-different-payment-methods-for-purchasing-travel-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/how-can-i-save-money-while-buying-travel-insurance-online",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-is-the-process-of-buying-travel-insurance-online",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance/what-is-travel-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/travel-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/can-a-tenant-buy-this-policy",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/home-family-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/are-domestic-employees-also-covered-under-the-policy",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/what-are-the-disadvantages-hazards-covered-under-this-policy",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/does-home-insurance-cover-any-loss-of-my-jewelery",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/do-tenants-have-legal-liability-under-this-policy",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/is-personal-accident-a-part-of-the-policy",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/what-are-the-risks-covered-by-home-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/do-i-get-a-cover-to-pay-off-my-home-loan",
			"https://www.iffcotokio.co.in/"+Language+"/home-insurance/are-home-appliances-included-in-the-policy",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-happens-when-a-customer-sells-his-vehicle",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-is-meant-by-idv",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/value-auto-coverage",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-are-the-exclusions-under-private-car-package-policy",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/when-is-an-endorsement-required",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/car-insurance",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/under-which-circumstances-no-claim-bonus-ncb-can-be-allowed",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/when-should-pre-approval-inspection-be-done",
			"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/iffco-tokios-24-x-7-road-assistance"	
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/when-do-we-need-an-offer-form-from-a-customer"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/for-which-period-a-motor-policy-is-issued"	
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/claims"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-are-the-documents-required-for-policy-renewal"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-additional-pa-covers-are-available-under-private-car-policies"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-is-the-exemption-given-under-private-car-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-is-the-scope-of-private-car-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-are-the-electrical-electronic-accessories-in-a-personal-car"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/two-wheeler-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-is-a-cover-note"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-are-motor-policy-coverage"	
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/what-are-the-factors-that-determine-the-premium-rating-for-personal-cars"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/bankers-blanket-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/boiler-pressure-plant-bpp-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/standard-fire-special-perils-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/contractors-plant-machinery-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/machinery-breakdown-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/consequential-loss-fire-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/electronic-equipment-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/contractors-all-risk-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/industrial-all-risk-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance/machinery-loss-profit-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/property-fire-engineering-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/marine-insurance/sagar-bandhu-bima-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/marine-insurance/marine-cargo-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/marine-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/public-liability-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/directors-officers-liability-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/professional-indemnity-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/public-liability-industrial-storage-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/public-liability-non-industrial-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance/product-liability-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/liability-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products"
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance/comprehensive-general-liability-cgl"	
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance/errors-and-omissions-technology-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance/credit-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance/fine-arts-insurance-private-collectors-dealers-and-gallery-owners"
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance/multi-modal-transport-mto-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/specialty-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/kisan-suvidha-bima"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/unified-package-insurance-scheme"	
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/pashu-dhan-bima-yojana"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/jan-suraksha-bima-yojna"	
			,"https://www.iffcotokio.co.in/"+Language+"/agents/irda-regulation-advisor"
			,"https://www.iffcotokio.co.in/"+Language+"/agents/why-iffco-tokio"
			,"https://www.iffcotokio.co.in/"+Language+"/agents/hiring-process"
			,"https://www.iffcotokio.co.in/"+Language+"/agents/growth-potential"	
			,"https://www.iffcotokio.co.in/"+Language+"/agents/become-agent"
			,"https://www.iffcotokio.co.in/"+Language+"/agents"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-is-no-claim-bonus-ncb"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/claim-status"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/garage-list"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/are-there-any-discounts-available-if-i-install-an-anti-theft-alarm-and-locking-system"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/whether-additional-premium-has-to-be-paid-in-case-of-last-year-s-claim"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/i-have-a-vehicle-that-has-recently-had-an-accident-but-i-was-not-driving-that-vehicle-can-i-still-claim"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/faqs-claims"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/can-my-claim-be-dismissed"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-are-the-exclusions-under-motor-policy"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-is-loading-do-you-charge-it-how-many-loads-can-be-charged"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/claim-procedure"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/do-i-get-the-full-amount-if-my-windscreen-gets-damaged"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/feedback"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-is-total-rescue-and-loss"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-is-idv"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/what-if-my-car-suffers-from-an-accident-and-i-don-t-suffer-any-major-damage"	
			,"https://www.iffcotokio.co.in/"+Language+"/buy-renew"
			,"https://www.iffcotokio.co.in/"+Language+"/faq"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/independent-directors"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/awards-recognition"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/company-profile"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/annual-reports"	
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/mission-vision-and-values"	
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/promoters"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company"
			,"https://www.iffcotokio.co.in/"+Language+"/pradhan-mantri-fasal-bima-yojana"	
			,"https://www.iffcotokio.co.in/"+Language+"/search-result"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/ask-expert"	
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/workmens-compensation"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/corporate-health/group-personal-accident-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/corporate-health/group-mediclaim-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/corporate-health"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/industry-protector-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/jewellers-block-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/fidelity-guarantee-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/office-professional-establishment-protector-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/money-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/business-products/others-business-products/burglary-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/trade-insurance/trade-protector-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/claim-forms"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/family-health-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/individual-health-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/agents/corporate-agent"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/cashless-facilities"	
			,"https://www.iffcotokio.co.in/"+Language+"/claims"
			,"https://www.iffcotokio.co.in/"+Language+"/renew-policy"	
			,"https://www.iffcotokio.co.in/"+Language+"/about-us"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/critical-illness-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/why-do-i-need-insurance"	
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-the-term-of-a-general-insurance-policy"			  
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-underwriting"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/premium-payment-modes"	
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/service-page/policy_renewal"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/service-page/service-requests"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/service-page"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-does-insured-mean"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/is-auto-insurance-compulsory-in-india"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-the-meaning-of-the-insurer"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-the-difference-between-an-agent-and-a-broker"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/grievance-redressal"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/where-is-the-corporate-office-of-iffcco-tokio-located"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/how-do-i-buy-a-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/faqs"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/who-owns-Iffco-tokio-general-Insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-the-meaning-of-premium"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/what-is-irda-and-what-do-they-do"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/who-owns-iffco-tokio-general-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services"
			,"https://www.iffcotokio.co.in/"+Language+"/regional/health-insurance/thankyou"
			,"https://www.iffcotokio.co.in/"+Language+"/regional"
			,"https://www.iffcotokio.co.in/"+Language+"/lp/health-insurance/thankyou"
			,"https://www.iffcotokio.co.in/"+Language+"/lp"
			,"https://www.iffcotokio.co.in/"+Language+"/claims/register-a-claim"
			,"https://www.iffcotokio.co.in/"+Language+"/bike-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/regional/bike-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/lp/health-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/regional/health-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/car-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/regional/car-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/site-map"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/individual-personal-accident-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/janata-suraksha-bima-yojna"
			,"https://www.iffcotokio.co.in/"+Language+"/trade-insurance/trade-suvidha-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/home-insurance/home-suvidha-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/home-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance/jan-sewa-bima-yojna"
			,"https://www.iffcotokio.co.in/"+Language+"/micro-rural-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/trade-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/contact-us/customer-services/download-forms"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/health-protector-plus-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/swasthya-kavach-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/health-insurance/individual-medishield-policy"
			,"https://www.iffcotokio.co.in/"+Language+"/motor-insurance/commercial-vehicle-insurance"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/csr"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/key-persons"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/management-team"
			,"https://www.iffcotokio.co.in/"+Language+"/about-us/our-company/board-directors"	
		  };	
		System.out.println("total links : " + linkList.length);
		
		for(int i= 0; i < linkList.length;i++) {
			String url  = linkList[i];
			
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >= 400) {
					System.out.println(url+ " broken link");
					brokenUrls.add(linkList[i]);
					brokenLinkCount++;	
				}else {
					System.out.println(url+ " not broken link");
				}
				
			}catch(MalformedURLException e){
				
			}
			catch(Exception e) {
				
			}
		}
		
		System.out.println("total broken link : " + brokenLinkCount);
		
		System.out.println(brokenUrls);
		
		//driver.close();

	}

}
