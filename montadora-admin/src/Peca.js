import * as React from "react";
import {NumberInput, SimpleFormIterator, List, Datagrid, TextField, EditButton, Edit, SimpleForm, TextInput, Create, ArrayInput} from 'react-admin';

export const PecaList = props => (
    <List {...props}>
        <Datagrid>
            <TextField source="id" />
            <TextField source="nome" />
            <TextField source="tipo" />
            <TextField source="motor" />
            <EditButton/>
        </Datagrid>
    </List>
);

export const PecaEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id" />
            <TextInput source="nome" />
            <TextInput source="tipo" />
            <ArrayInput source="motor">
                <SimpleFormIterator>
                    <NumberInput source="id" />
                </SimpleFormIterator>
            </ArrayInput>
        </SimpleForm>
    </Edit>
);

export const PecaCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="nome" />
            <TextInput source="tipo" />
        </SimpleForm>
    </Create>
);