<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>select_-- Pilih --BeginnerIntermediateAdvan_943818</name>
   <tag></tag>
   <elementGuidId>8a75e6f4-7193-49bc-8d06-2ef41da40297</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='collapseLanguage--1']/div[3]/div[2]/select</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>select.custom-select.required.selectLanguageLevel--1--1</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>#collapseLanguage--1 >> internal:role=combobox >> nth=0</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>select</value>
      <webElementGuid>95b995e6-01b1-4451-80e2-87a9ebd98511</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-collapse</name>
      <type>Main</type>
      <value>#collapseLanguage--1</value>
      <webElementGuid>bb39e637-8c4b-43d9-a85d-6e9d43330719</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>custom-select required selectLanguageLevel--1--1</value>
      <webElementGuid>b2bd59fd-6f0b-4eb6-9728-9de69acdfe69</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>onchange</name>
      <type>Main</type>
      <value>
            if($(this).val() === ''){
                $('#txtLanguageLevel--1').text($(this).val()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#frame').contents().find('#txtListLanguageLevel--1').text($(this).val()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#txtListLanguageLevel--1').text($(this).val()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
            } else {
                $('#txtLanguageLevel--1').text('('+$(this).find('option:selected').text()+')').fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#frame').contents().find('#txtListLanguageLevel--1').text('Writing         : '+$(this).find('option:selected').text()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#txtListLanguageLevel--1').text('Writing        : '+$(this).find('option:selected').text()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#frame').contents().find('#txtListLanguageLevel--1').text('Writing         : '+$(this).find('option:selected').text()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
                $('#txtListLanguageLevel--1').text('Writing        : '+$(this).find('option:selected').text()).fadeTo(100, 0.3, function() { $(this).fadeTo(100, 1.0); })
            }
            isLanguageValueBlank(); autoSave(); validateRequire($(this))</value>
      <webElementGuid>8bd26452-edf4-481e-94c3-463bd6f44f2b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
            -- Pilih --BeginnerIntermediateAdvanceFluentNative
        </value>
      <webElementGuid>2070a48e-d9bc-48ce-af48-a6e65eccbcdd</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;collapseLanguage--1&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;form-group col-md-6&quot;]/select[@class=&quot;custom-select required selectLanguageLevel--1--1&quot;]</value>
      <webElementGuid>c411e80a-dd07-496c-a341-73081e16144f</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='collapseLanguage--1']/div[3]/div[2]/select</value>
      <webElementGuid>59e39c71-34ef-412b-9466-6307902b8dc1</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Tingkat'])[1]/following::select[1]</value>
      <webElementGuid>947c6540-4fb2-403c-9909-1d745586f726</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Kemampuan'])[1]/following::select[1]</value>
      <webElementGuid>c0f1abb0-6c3f-4027-96fd-3aae2968af69</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Kemampuan'])[2]/preceding::select[1]</value>
      <webElementGuid>aad54a74-8986-464a-a02a-732bc6281d18</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Tingkat'])[2]/preceding::select[1]</value>
      <webElementGuid>fe764115-5b4f-4463-ad10-73df4f918d9f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[3]/div[2]/select</value>
      <webElementGuid>e9cfd320-b5bb-4cfc-a634-7b78c5dab164</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//select[(text() = '
            -- Pilih --BeginnerIntermediateAdvanceFluentNative
        ' or . = '
            -- Pilih --BeginnerIntermediateAdvanceFluentNative
        ')]</value>
      <webElementGuid>3f9a12ab-9e53-4703-8d88-8a35a2b0126b</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
