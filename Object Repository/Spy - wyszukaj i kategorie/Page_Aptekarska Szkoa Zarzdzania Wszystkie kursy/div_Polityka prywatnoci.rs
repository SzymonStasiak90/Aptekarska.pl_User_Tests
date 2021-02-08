<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Polityka prywatnoci</name>
   <tag></tag>
   <elementGuidId>b761a384-5e1d-4e51-950d-1d9632aa9020</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.page-footer-inner</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//footer[@id='page-footer']/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>page-footer-inner</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	    
	        
	        
	        
	        
	        
	        
	
	     Kontaktemail: biuro@aptekarska.pltel. 603 083 715 (e-learning)tel. 669 492 249 (webinary)Pon.-pt. 8:00-15:00Sprawdź autentyczność wydanego certyfikatu:Weryfikacja certyfikatu  Strona www  Grupa na FB Regulamin serwisu aptekarska.pl Polityka prywatności
	

	        
	        
	        
	        
	        
		
		        Nie jesteś zalogowany(a) (Zaloguj się)
		        
		        
		  
		        
		                
		                                    Opieka farmaceutyczna
		                                    Zarządzanie apteką
		                                    Aspekty prawne
		                                    Inne produkty
		                                    Twój koszyk
		                
		        
	        
	        
	      
	             
	             
	        
	        
	        
//&lt;![CDATA[
var require = {
    baseUrl : 'https://www.aptekarska.pl/oferta/lib/requirejs.php/1612178489/',
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,
    waitSeconds : 0,

    paths: {
        jquery: 'https://www.aptekarska.pl/oferta/lib/javascript.php/1612178489/lib/jquery/jquery-3.5.1.min',
        jqueryui: 'https://www.aptekarska.pl/oferta/lib/javascript.php/1612178489/lib/jquery/ui-1.12.1/jquery-ui.min',
        jqueryprivate: 'https://www.aptekarska.pl/oferta/lib/javascript.php/1612178489/lib/requirejs/jquery-private'
    },

    // Custom jquery config map.
    map: {
      // '*' means all modules will get 'jqueryprivate'
      // for their 'jquery' dependency.
      '*': { jquery: 'jqueryprivate' },
      // Stub module for 'process'. This is a workaround for a bug in MathJax (see MDL-60458).
      '*': { process: 'core/first' },

      // 'jquery-private' wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: 'jquery' }
    }
};

//]]>



//&lt;![CDATA[
M.util.js_pending(&quot;core/first&quot;);require(['core/first'], function() {
require(['core/prefetch']);
;
require([&quot;media_videojs/loader&quot;], function(loader) {
    loader.setUp(function(videojs) {
        videojs.options.flash.swf = &quot;https://www.aptekarska.pl/oferta/media/player/videojs/videojs/video-js.swf&quot;;
videojs.addLanguage('pl', {
  &quot;Play&quot;: &quot;Odtwarzaj&quot;,
  &quot;Pause&quot;: &quot;Pauza&quot;,
  &quot;Current Time&quot;: &quot;Aktualny czas&quot;,
  &quot;Duration&quot;: &quot;Czas trwania&quot;,
  &quot;Remaining Time&quot;: &quot;Pozostały czas&quot;,
  &quot;Stream Type&quot;: &quot;Typ strumienia&quot;,
  &quot;LIVE&quot;: &quot;NA ŻYWO&quot;,
  &quot;Loaded&quot;: &quot;Załadowany&quot;,
  &quot;Progress&quot;: &quot;Status&quot;,
  &quot;Fullscreen&quot;: &quot;Pełny ekran&quot;,
  &quot;Non-Fullscreen&quot;: &quot;Pełny ekran niedostępny&quot;,
  &quot;Mute&quot;: &quot;Wyłącz dźwięk&quot;,
  &quot;Unmute&quot;: &quot;Włącz dźwięk&quot;,
  &quot;Playback Rate&quot;: &quot;Szybkość odtwarzania&quot;,
  &quot;Subtitles&quot;: &quot;Napisy&quot;,
  &quot;subtitles off&quot;: &quot;Napisy wyłączone&quot;,
  &quot;Captions&quot;: &quot;Transkrypcja&quot;,
  &quot;captions off&quot;: &quot;Transkrypcja wyłączona&quot;,
  &quot;Chapters&quot;: &quot;Rozdziały&quot;,
  &quot;You aborted the media playback&quot;: &quot;Odtwarzanie zostało przerwane&quot;,
  &quot;A network error caused the media download to fail part-way.&quot;: &quot;Problemy z siecią spowodowały błąd przy pobieraniu materiału wideo.&quot;,
  &quot;The media could not be loaded, either because the server or network failed or because the format is not supported.&quot;: &quot;Materiał wideo nie może być załadowany, ponieważ wystąpił problem z siecią lub format nie jest obsługiwany&quot;,
  &quot;The media playback was aborted due to a corruption problem or because the media used features your browser did not support.&quot;: &quot;Odtwarzanie materiału wideo zostało przerwane z powodu uszkodzonego pliku wideo lub z powodu błędu funkcji, które nie są wspierane przez przeglądarkę.&quot;,
  &quot;No compatible source was found for this media.&quot;: &quot;Dla tego materiału wideo nie znaleziono kompatybilnego źródła.&quot;,
  &quot;Play Video&quot;: &quot;Odtwarzaj wideo&quot;,
  &quot;Close&quot;: &quot;Zamknij&quot;,
  &quot;Modal Window&quot;: &quot;Okno Modala&quot;,
  &quot;This is a modal window&quot;: &quot;To jest okno modala&quot;,
  &quot;This modal can be closed by pressing the Escape key or activating the close button.&quot;: &quot;Ten modal możesz zamknąć naciskając przycisk Escape albo wybierając przycisk Zamknij.&quot;,
  &quot;, opens captions settings dialog&quot;: &quot;, otwiera okno dialogowe ustawień transkrypcji&quot;,
  &quot;, opens subtitles settings dialog&quot;: &quot;, otwiera okno dialogowe napisów&quot;,
  &quot;, selected&quot;: &quot;, zaznaczone&quot;
});

    });
});;

require(['jquery', 'core/custom_interaction_events'], function($, CustomEvents) {
    CustomEvents.define('#single_select60186434776c41', [CustomEvents.events.accessibleChange]);
    $('#single_select60186434776c41').on(CustomEvents.events.accessibleChange, function() {
        var ignore = $(this).find(':selected').attr('data-ignore');
        if (typeof ignore === typeof undefined) {
            $('#switchcategory').submit();
        }
    });
});
;

require(['theme_boost/loader']);
require(['theme_boost/drawer'], function(mod) {
    mod.init();
});
;
M.util.js_pending('core/notification'); require(['core/notification'], function(amd) {amd.init(424, [], false); M.util.js_complete('core/notification');});;
M.util.js_pending('core/log'); require(['core/log'], function(amd) {amd.setConfig({&quot;level&quot;:&quot;warn&quot;}); M.util.js_complete('core/log');});;
M.util.js_pending('core/page_global'); require(['core/page_global'], function(amd) {amd.init(); M.util.js_complete('core/page_global');});M.util.js_complete(&quot;core/first&quot;);
});
//]]>



//&lt;![CDATA[
M.str = {&quot;moodle&quot;:{&quot;lastmodified&quot;:&quot;Ostatnia modyfikacja&quot;,&quot;name&quot;:&quot;Nazwa&quot;,&quot;error&quot;:&quot;B\u0142\u0105d&quot;,&quot;info&quot;:&quot;Informacja&quot;,&quot;yes&quot;:&quot;Tak&quot;,&quot;no&quot;:&quot;Nie&quot;,&quot;cancel&quot;:&quot;Anuluj&quot;,&quot;confirm&quot;:&quot;Potwierd\u017a&quot;,&quot;areyousure&quot;:&quot;Czy jeste\u015b pewny?&quot;,&quot;closebuttontitle&quot;:&quot;Zamknij&quot;,&quot;unknownerror&quot;:&quot;Nieznany b\u0142\u0105d&quot;,&quot;file&quot;:&quot;Plik&quot;,&quot;url&quot;:&quot;URL&quot;},&quot;repository&quot;:{&quot;type&quot;:&quot;Typ&quot;,&quot;size&quot;:&quot;Rozmiar&quot;,&quot;invalidjson&quot;:&quot;Nieprawid\u0142owy ci\u0105g jSON&quot;,&quot;nofilesattached&quot;:&quot;Nie za\u0142\u0105czono plik\u00f3w&quot;,&quot;filepicker&quot;:&quot;Wyb\u00f3r plik\u00f3w&quot;,&quot;logout&quot;:&quot;Wyloguj si\u0119&quot;,&quot;nofilesavailable&quot;:&quot;Brak dost\u0119pnych plik\u00f3w&quot;,&quot;norepositoriesavailable&quot;:&quot;Niestety, \u017cadne z istniej\u0105cych repozytori\u00f3w nie mo\u017ce zawiera\u0107 plik\u00f3w w wymaganym formacie.&quot;,&quot;fileexistsdialogheader&quot;:&quot;Plik istnieje&quot;,&quot;fileexistsdialog_editor&quot;:&quot;Plik o wybranej nazwie zosta\u0142 ju\u017c za\u0142\u0105czony do tekstu, kt\u00f3ry edytujesz.&quot;,&quot;fileexistsdialog_filemanager&quot;:&quot;Plik o wybranej nazwie ju\u017c zosta\u0142 do\u0142\u0105czony&quot;,&quot;renameto&quot;:&quot;Zmie\u0144 nazw\u0119 na&quot;,&quot;referencesexist&quot;:&quot;Istnieje {$a} skr\u00f3t\u00f3w, kt\u00f3re wykorzystuj\u0105 ten plik jako \u017ar\u00f3d\u0142o.&quot;,&quot;select&quot;:&quot;Wybierz&quot;},&quot;admin&quot;:{&quot;confirmdeletecomments&quot;:&quot;Zamierzasz usun\u0105\u0107 komentarze, czy jeste\u015b pewien(a)?&quot;,&quot;confirmation&quot;:&quot;Potwierdzenie&quot;},&quot;debug&quot;:{&quot;debuginfo&quot;:&quot;Debug info&quot;,&quot;line&quot;:&quot;Line&quot;,&quot;stacktrace&quot;:&quot;Stack trace&quot;},&quot;langconfig&quot;:{&quot;labelsep&quot;:&quot;:&quot;}};
//]]>


//&lt;![CDATA[
(function() {M.util.help_popups.setup(Y);
 M.util.js_pending('random60186434776c43'); Y.on('domready', function() { M.util.js_complete(&quot;init&quot;);  M.util.js_complete('random60186434776c43'); });
})();
//]]>


	        
	        
	    
	</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;page-footer&quot;)/div[@class=&quot;page-footer-inner&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//footer[@id='page-footer']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Strona główna'])[2]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Dalej'])[2]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//footer/div</value>
   </webElementXpaths>
</WebElementEntity>
