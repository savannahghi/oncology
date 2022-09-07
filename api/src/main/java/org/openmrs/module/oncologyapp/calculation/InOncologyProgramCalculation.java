package org.openmrs.module.oncologyapp.calculation;

import org.openmrs.Encounter;
import org.openmrs.EncounterType;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.Calculations;
import org.openmrs.module.kenyaemr.calculation.EmrCalculationUtils;
import org.openmrs.module.metadatadeploy.MetadataUtils;
import org.openmrs.module.oncologyapp.metadata.OncologyScreeningMetadata;

import java.util.Collection;
import java.util.Map;

public class InOncologyProgramCalculation extends AbstractPatientCalculation {
	
	/**
	 * @see org.openmrs.calculation.patient.PatientCalculation#evaluate(java.util.Collection,
	 *      java.util.Map, org.openmrs.calculation.patient.PatientCalculationContext)
	 */
	@Override
	public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> params,
	        PatientCalculationContext context) {
		CalculationResultMap map = new CalculationResultMap();
		
		CalculationResultMap lastScreeningEncounter = Calculations.lastEncounter(
		    MetadataUtils.existing(EncounterType.class, OncologyScreeningMetadata._EhrEncounterTypes.ONCOLOGY_SCREENING), cohort,
		    context);
		for (Integer pId : cohort) {
			boolean screened = false;
			Encounter encounter = EmrCalculationUtils.encounterResultForPatient(lastScreeningEncounter, pId);
			
			if (encounter != null) {
				screened = true;
			}
			
			map.put(pId, new BooleanResult(screened, this));
		}
		return map;
	}
}
