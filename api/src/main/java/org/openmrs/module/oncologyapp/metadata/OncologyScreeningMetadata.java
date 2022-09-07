package org.openmrs.module.oncologyapp.metadata;

import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.openmrs.module.metadatadeploy.bundle.CoreConstructors;
import org.springframework.stereotype.Component;

@Component
public class OncologyScreeningMetadata extends AbstractMetadataBundle {

    public OncologyScreeningMetadata() {
    }

    public void install() throws Exception

    {
        this.install(CoreConstructors.program("Oncology Program", "Oncology program", "116030AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "64d6b82c-08a9-11eb-b236-077a7c74158b"));
        this.install(CoreConstructors.encounterType("Oncology Initial", "Initial oncology encounter type", "586660a8-08ca-11eb-9dac-6f55ef0a3a7d"));
        this.install(CoreConstructors.encounterType("Oncology Discontinue", "Discontinue oncology encounter type", "7ae70e0c-08ca-11eb-9325-676401a68809"));
        this.install(CoreConstructors.encounterType("Oncology Followup", "Follow up oncology encounter type", "984405fe-08ca-11eb-bb7a-cb6ccfe9c91e"));
        this.install(CoreConstructors.encounterType("Oncology Screening", "Oncology screening  encounter type", "e24209cc-0a1d-11eb-8f2a-bb245320c623"));
        this.install(CoreConstructors.encounterType("Family cancer history", "Family cancer history encounter type", "b9c51a7e-0e24-11eb-9559-13c33ac53eec"));
        this.install(CoreConstructors.form("Oncology Initial enrollment form", "Initial form for oncology enrollment", "586660a8-08ca-11eb-9dac-6f55ef0a3a7d", "1.0", "4b19bf6a-08cc-11eb-ad40-63f9910aca7b"));
        this.install(CoreConstructors.form("Oncology  Discontinuation form", "Discontinuation  form for oncology", "7ae70e0c-08ca-11eb-9325-676401a68809", "1.0", "67b0c4de-08cc-11eb-ae4d-c756d1210d5c"));
        this.install(CoreConstructors.form("Oncology Followup form", "Followup form for oncology", "984405fe-08ca-11eb-bb7a-cb6ccfe9c91e", "1.0", "884df5d6-08cc-11eb-a31e-27b10c64a0a7"));
        this.install(CoreConstructors.form("Cancer Screening and early diagnosis", "Cancer Screening and early diagnosis form", "e24209cc-0a1d-11eb-8f2a-bb245320c623", "1.0", "be5c5602-0a1d-11eb-9e20-37d2e56925ee"));
        this.install(CoreConstructors.form("Family cancer history form", "Family cancer history form for oncology", "b9c51a7e-0e24-11eb-9559-13c33ac53eec", "1.0", "dd0e4f3c-0e24-11eb-aa70-bb2cf351b19b"));
        this.install(CoreConstructors.form("Cancer treatment form", "Cancer treatment form", "d029ec12-6bae-11eb-b775-0f590ebc4940", "1.0", "03f8d332-6baf-11eb-b344-93a63e368991"));
    }

    public static final class _EhrForms {
        public static final String ONCOLOGY_ENROLLMENT_FORM = "4b19bf6a-08cc-11eb-ad40-63f9910aca7b";
        public static final String ONCOLOGY_DISCONTINUATION_FORM = "67b0c4de-08cc-11eb-ae4d-c756d1210d5c";
        public static final String ONCOLOGY_FOLLOWUP_FORM = "884df5d6-08cc-11eb-a31e-27b10c64a0a7";
        public static final String ONCOLOGY_SCREENING_FORM = "be5c5602-0a1d-11eb-9e20-37d2e56925ee";
        public static final String ONCOLOGY_TREATMENT_FORM = "03f8d332-6baf-11eb-b344-93a63e368991";
        public static final String FAMILY_CANCER_HISTORY = "dd0e4f3c-0e24-11eb-aa70-bb2cf351b19b";
        public static final String DMHTN_PROGRAM_FORM = "9836224a-18fb-11eb-b83c-232364035228";
        public static final String NCD_FOLLOW_UP = "b3e07c84-18fb-11eb-bab2-6f7808a09aa6";
        public static final String NCD_DISCONTINUE = "d2c4ae9a-18fb-11eb-ab7d-1b8027b414d7";
        public static final String NCD_INITIAL = "edd8c072-18fb-11eb-9c05-839296c291c4";
        public static final String NCD_SCREENING = "099d5e12-18fc-11eb-86f3-231df7469c4e";
        public static final String EHR_ADDON_TEMP_FORM = "66c4664a-8d45-11eb-9ab1-3359b033ed37";
        public static final String EHR_GBV_ENROLLMENT = "66ed9f50-5433-11ec-979c-17759fbd2edb";

        public _EhrForms() {
        }
    }

    public static final class _EhrPrograms {
        public static final String ANC_PROGRAM = "e8751e5c-fbda-11ea-9bba-ff7e8cea17d3";
        public static final String ANC_PROGRAM_CONCEPT = "160446AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String PNC_PROGRAM = "23edfbca-fbdb-11ea-a675-17377ca3079e";
        public static final String CWC_PROGRAM = "645d7e4c-fbdb-11ea-911a-5fe00fc87a47";
        public static final String CWC_PROGRAM_CONCEPT = "163110AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String PNC_PROGRAM_CONCEPT = "1623AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String ONCOLOGY_PROGRAM_CONCEPT = "116030AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String ONCOLOGY_PROGRAM = "64d6b82c-08a9-11eb-b236-077a7c74158b";
        public static final String EHR_REPORTS_PROGRAM = "7a822d3e-8d40-11eb-92cc-5f145f16bd2e";
        public static final String EHR_REPORTS_PROGRAM_CONCEPT = "5089AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        public static final String EHR_NCD_PROGRAM_UUID = "8b4f6a38-4f5e-11ec-a4c2-a75a2e13cdaa";
        public static final String EHR_NCD_PROGRAM_CONCEPT_UUID = "144544AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

        public _EhrPrograms() {
        }
    }

    public static final class _EhrEncounterTypes{
        public static final String ONCOLOGY_INITIAL = "586660a8-08ca-11eb-9dac-6f55ef0a3a7d";
        public static final String ONCOLOGY_DISCONTINUE = "7ae70e0c-08ca-11eb-9325-676401a68809";
        public static final String ONCOLOGY_FOLLOWUP = "984405fe-08ca-11eb-bb7a-cb6ccfe9c91e";
        public static final String ONCOLOGY_SCREENING = "e24209cc-0a1d-11eb-8f2a-bb245320c623";
        public static final String ONCOLOGY_TREATMENT_ENCOUNTER_TYPE = "d029ec12-6bae-11eb-b775-0f590ebc4940";
        public static final String FAMILY_CANCER_HISTORY = "b9c51a7e-0e24-11eb-9559-13c33ac53eec";
        public _EhrEncounterTypes(){

        }
    }
}
