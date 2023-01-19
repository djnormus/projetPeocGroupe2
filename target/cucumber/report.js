$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/myAccountDetails.feature");
formatter.feature({
  "name": "US05 - Visualisation des informations du compte depuis la page \"My Account\"",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POE2-11"
    }
  ]
});
formatter.scenario({
  "name": "Test US05 - Vérifier que dans la page \"My Account\" un lien \"Account Details\" redirige vers les informations de comptes (nom prénom, mail)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-11"
    },
    {
      "name": "@TEST_POE2-32"
    },
    {
      "name": "@TESTSET_POE2-56"
    },
    {
      "name": "@TESTSET_POE2-91"
    },
    {
      "name": "@endproject-emna"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j ouvre l application",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé login \u0027poecgroupe26@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password valide dans le pavé login \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton login",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurAccountDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je suis redirigé vers les informations de compte",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSuisRedirigeVersLesInformationsDeCompte()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test US05 - Vérifier que le changement du mot de passe est réussi",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-11"
    },
    {
      "name": "@TEST_POE2-33"
    },
    {
      "name": "@TESTSET_POE2-56"
    },
    {
      "name": "@TESTSET_POE2-91"
    },
    {
      "name": "@endproject-emna"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j ouvre l application",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé login \u0027poecgroupe26@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password valide dans le pavé login \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton login",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurAccountDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le password actuel dans le champ Current Password \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLePasswordActuelDansLeChampCurrentPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le nouveau password dans le champ New Password \u0027Poecgroupe2@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLeNouveauPasswordDansLeChampNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je confirme le password dans le champ Confirm New Password \u0027Poecgroupe2@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeConfirmeLePasswordDansLeChampConfirmNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton SAVE CHANGES",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurLeBoutonSAVECHANGES()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le password est modifié avec un message de confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_Steps.lePasswordEstModifieAvecUnMessageDeConfirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test US05 - Vérifier que le changement du mot de passe est KO en saisissant le password actuel INCORRECT",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-11"
    },
    {
      "name": "@TEST_POE2-105"
    },
    {
      "name": "@TESTSET_POE2-56"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j ouvre l application",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé login \u0027poecgroupe26@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password valide dans le pavé login \u0027Poecgroupe2@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton login",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurAccountDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le password actuel incorrect dans le champ Current Password \u0027Poecgroupe\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLePasswordActuelIncorrectDansLeChampCurrentPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le nouveau password dans le champ New Password \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLeNouveauPasswordDansLeChampNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je confirme le password dans le champ Confirm New Password \u0027Poecgroupe2@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeConfirmeLePasswordDansLeChampConfirmNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton SAVE CHANGES",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurLeBoutonSAVECHANGES()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le password n est pas modifié et un message d erreur s affiche Your current password is incorrect",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_Steps.lePasswordNEstPasModifieEtUnMessageDErreurSAfficheYourCurrentPasswordIsIncorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test US05 - Vérifier que le changement du mot de passe est KO quand les nouveaux passwords ne correspondent pas (confirmation password)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POE2-11"
    },
    {
      "name": "@TEST_POE2-106"
    },
    {
      "name": "@TESTSET_POE2-56"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "j ouvre l application",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jOuvreLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountConformPsw_Steps.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis mon email dans le pavé login \u0027poecgroupe26@endtest.io\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password valide dans le pavé login \u0027Poecgroupe2@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton login",
  "keyword": "And "
});
formatter.match({
  "location": "Authentication_Steps.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurAccountDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le password actuel dans le champ Current Password \u0027Poecgroupe2@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLePasswordActuelDansLeChampCurrentPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis le nouveau password dans le champ New Password \u0027Poecgroupe2@@@@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeSaisisLeNouveauPasswordDansLeChampNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je confirme le password dans le champ Confirm New Password \u0027Poecgroupe2@@@\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeConfirmeLePasswordDansLeChampConfirmNewPasswordPoecgroupe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton SAVE CHANGES",
  "keyword": "And "
});
formatter.match({
  "location": "AccountDetails_Steps.jeCliqueSurLeBoutonSAVECHANGES()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "le password n est pas modifié et un message d erreur s affiche New passwords do not match",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountDetails_Steps.lePasswordNEstPasModifieEtUnMessageDErreurSAfficheNewPasswordsDoNotMatch()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});